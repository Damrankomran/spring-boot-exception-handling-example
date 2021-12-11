package com.example.springbootexceptionhandlingexample.service;

import com.example.springbootexceptionhandlingexample.dto.CustomerDTO;

/**
 * @author emre.aydin
 * @since 11.12.2021
 */
public interface CustomerService {

    CustomerDTO getCustomerByName(String name);
}
