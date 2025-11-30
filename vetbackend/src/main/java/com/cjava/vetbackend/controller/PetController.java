package com.cjava.vetbackend.controller;

import com.cjava.vetbackend.entity.Pet;
import com.cjava.vetbackend.service.PetService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService service;

    public PetController(PetService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pet> listAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Pet getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/customer/{idCustomer}")
    public List<Pet> getByCustomer(@PathVariable Integer idCustomer) {
        return service.findByCustomer(idCustomer);
    }

    @PostMapping
    public Pet create(@RequestBody Pet pet) {
        return service.save(pet);
    }

    @PutMapping("/{id}")
    public Pet update(@PathVariable Integer id, @RequestBody Pet pet) {
        pet.setIdPet(id);
        return service.save(pet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
