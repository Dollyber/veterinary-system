package com.cjava.vetbackend.service.impl;

import com.cjava.vetbackend.entity.Pet;
import com.cjava.vetbackend.repository.PetRepository;
import com.cjava.vetbackend.service.PetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository repository;

    public PetServiceImpl(PetRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pet> findAll() {
        return repository.findAll();
    }

    @Override
    public Pet findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Pet> findByCustomer(Integer idCustomer) {
        return repository.findByCustomerIdCustomer(idCustomer);
    }

    @Override
    public Pet save(Pet pet) {
        return repository.save(pet);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
