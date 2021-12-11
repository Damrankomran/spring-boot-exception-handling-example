package com.example.springbootexceptionhandlingexample.service.impl;

import com.example.springbootexceptionhandlingexample.dto.CustomerDTO;
import com.example.springbootexceptionhandlingexample.exception.RecordNotFoundException;
import com.example.springbootexceptionhandlingexample.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author emre.aydin
 * @since 11.12.2021
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private static final List<CustomerDTO> customerList = new ArrayList<>();

    @PostConstruct
    public void init() {
        log.info("PostConstruct init.");
        customerList.add(new CustomerDTO("Emre", "Aydın", 23));
        customerList.add(new CustomerDTO("Ali", "Çınar", 51));
        customerList.add(new CustomerDTO("Seda", "Toprak", 33));
    }

    @Override
    public CustomerDTO getCustomerByName(String name) {
        return customerList.stream()
                .filter(customer -> customer.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new RecordNotFoundException(name));
    }
}
