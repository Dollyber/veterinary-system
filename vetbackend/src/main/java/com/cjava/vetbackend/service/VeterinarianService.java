package com.cjava.vetbackend.service;

import com.cjava.vetbackend.entity.Veterinarian;

import java.util.List;

public interface VeterinarianService {
    List<Veterinarian> findAll();
    Veterinarian findById(Integer id);
    Veterinarian save(Veterinarian veterinarian);
    void delete(Integer id);
}
