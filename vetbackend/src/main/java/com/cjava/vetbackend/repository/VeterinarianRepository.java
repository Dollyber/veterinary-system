package com.cjava.vetbackend.repository;

import com.cjava.vetbackend.entity.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarianRepository extends JpaRepository<Veterinarian, Integer> {
}
