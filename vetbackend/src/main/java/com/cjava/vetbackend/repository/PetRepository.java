package com.cjava.vetbackend.repository;

import com.cjava.vetbackend.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Integer> {
    List<Pet> findByCustomerIdCustomer(Integer idCustomer);
}
