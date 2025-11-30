package com.cjava.vetbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cjava.vetbackend.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
