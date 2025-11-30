package com.cjava.vetbackend.service.impl;

import com.cjava.vetbackend.entity.Veterinarian;
import com.cjava.vetbackend.repository.VeterinarianRepository;
import com.cjava.vetbackend.service.VeterinarianService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarianServiceImpl implements VeterinarianService {

    private final VeterinarianRepository repository;

    public VeterinarianServiceImpl(VeterinarianRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Veterinarian> findAll() {
        return repository.findAll();
    }

    @Override
    public Veterinarian findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Veterinarian save(Veterinarian veterinarian) {
        return repository.save(veterinarian);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
