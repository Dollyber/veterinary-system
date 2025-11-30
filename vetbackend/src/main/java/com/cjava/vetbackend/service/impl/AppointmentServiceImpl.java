package com.cjava.vetbackend.service.impl;

import com.cjava.vetbackend.entity.Appointment;
import com.cjava.vetbackend.repository.AppointmentRepository;
import com.cjava.vetbackend.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentServiceImpl(AppointmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Appointment> findAll() {
        return repository.findAll();
    }

    @Override
    public Appointment findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Appointment save(Appointment appointment) {
        return repository.save(appointment);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
