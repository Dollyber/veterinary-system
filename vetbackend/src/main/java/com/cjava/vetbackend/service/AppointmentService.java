package com.cjava.vetbackend.service;

import com.cjava.vetbackend.entity.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> findAll();
    Appointment findById(Integer id);
    Appointment save(Appointment appointment);
    void delete(Integer id);
}
