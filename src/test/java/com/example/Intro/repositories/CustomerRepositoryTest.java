package com.example.Intro.repositories;


import com.example.Intro.models.Customer;
import com.example.Intro.models.CustomerStatus;
import com.example.Intro.models.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;
    Customer customer1;
    Customer customer2;
    Customer customer3;
    Customer customer4;
    Customer customer5;
    Customer customer6;
    Customer customer7;
    Customer customer8;

    @BeforeEach
    void setUp() {
        customer1 = new Customer("Agustine Riviera", CustomerStatus.Silver);
        customer2 = new Customer("Alaina Sepulvida", CustomerStatus.None);
        customer3 = new Customer("Tom Jones", CustomerStatus.Gold);
        customer4 = new Customer("Sam Rio", CustomerStatus.None);
        customer5 = new Customer("Jessica James", CustomerStatus.Silver);
        customer6 = new Customer("Ana Janco", CustomerStatus.Silver);
        customer7 = new Customer("Jennifer Cortez", CustomerStatus.Gold);
        customer8 = new Customer("Christian Janco", CustomerStatus.Silver);

        customerRepository.saveAll(List.of(customer1, customer2, customer3, customer4,customer5,customer6,customer7,customer8));
    }

    @AfterEach
    void deleteCustomerRepository() {
        customerRepository.deleteAll();
    }

    @Test
    void shouldReturnCustomer_UsingValidId() {
        Optional<Customer> newCustomerOptional = customerRepository.findById(customer3.getId());
        if(newCustomerOptional.isPresent()){
            assertEquals(customer3.getId(),newCustomerOptional.get().getId());
            assertTrue(customer3.getName().equals(newCustomerOptional.get().getName()));
            assertFalse(!customer3.getStatus().equals(newCustomerOptional.get().getStatus()));
        }
    }

    @Test
    void shouldReturnListCustomerByName() {
        List<Customer> newCustomerRepository = customerRepository.findByNameContaining(customer3.getName());
        if(!newCustomerRepository.isEmpty()){
            assertTrue(newCustomerRepository.size()>0);
        }
    }



}
