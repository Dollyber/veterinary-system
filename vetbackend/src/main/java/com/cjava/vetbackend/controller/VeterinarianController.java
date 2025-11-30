package com.cjava.vetbackend.controller;

import com.cjava.vetbackend.entity.Veterinarian;
import com.cjava.vetbackend.service.VeterinarianService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/veterinarians")
public class VeterinarianController {

    private final VeterinarianService service;

    public VeterinarianController(VeterinarianService service) {
        this.service = service;
    }

    @GetMapping
    public List<Veterinarian> listAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Veterinarian getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Veterinarian create(@RequestBody Veterinarian veterinarian) {
        return service.save(veterinarian);
    }

    @PutMapping("/{id}")
    public Veterinarian update(@PathVariable Integer id, @RequestBody Veterinarian veterinarian) {
        veterinarian.setIdVeterinarian(id);
        return service.save(veterinarian);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
