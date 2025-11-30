package com.cjava.vetbackend.controller;

import com.cjava.vetbackend.entity.Appointment;
import com.cjava.vetbackend.service.AppointmentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Appointment> listAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Appointment getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment appointment) {
        return service.save(appointment);
    }

    @PutMapping("/{id}")
    public Appointment update(@PathVariable Integer id, @RequestBody Appointment appointment) {
        appointment.setIdAppointment(id);
        return service.save(appointment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
