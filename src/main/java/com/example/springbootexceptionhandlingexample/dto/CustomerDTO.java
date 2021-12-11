package com.example.springbootexceptionhandlingexample.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author emre.aydin
 * @since 11.12.2021
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String name;
    private String lastName;
    private Integer age;
}
