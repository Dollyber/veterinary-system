package com.cjava.vetbackend.service;

import com.cjava.vetbackend.entity.Pet;

import java.util.List;

public interface PetService {
    List<Pet> findAll();
    Pet findById(Integer id);
    List<Pet> findByCustomer(Integer idCustomer);
    Pet save(Pet pet);
    void delete(Integer id);
}
