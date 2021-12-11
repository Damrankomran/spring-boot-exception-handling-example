package com.example.springbootexceptionhandlingexample.endpoint;

import com.example.springbootexceptionhandlingexample.dto.CustomerDTO;
import com.example.springbootexceptionhandlingexample.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author emre.aydin
 * @since 11.12.2021
 */
@RestController
@RequestMapping(value = "/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(value = "get-by-name/{name}")
    public ResponseEntity<CustomerDTO> getCustomerByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(customerService.getCustomerByName(name), HttpStatus.OK);
    }
}
