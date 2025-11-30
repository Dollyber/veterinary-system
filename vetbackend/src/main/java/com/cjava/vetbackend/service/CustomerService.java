package com.cjava.vetbackend.service;

import com.cjava.vetbackend.entity.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Integer id);
    Customer save(Customer customer);
    void delete(Integer id);
}
