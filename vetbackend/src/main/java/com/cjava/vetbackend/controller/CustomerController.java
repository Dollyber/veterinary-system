package com.cjava.vetbackend.controller;

import com.cjava.vetbackend.entity.Customer;
import com.cjava.vetbackend.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Customer> listAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return service.save(customer);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable Integer id, @RequestBody Customer customer) {
        customer.setIdCustomer(id);
        return service.save(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
