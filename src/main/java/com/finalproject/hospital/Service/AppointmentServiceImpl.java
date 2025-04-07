package com.finalproject.hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.hospital.ResourceNotFoundException;
import com.finalproject.hospital.Entities.Appointment;
import com.finalproject.hospital.Repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment scheduleAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment registerAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment not found with ID: " + id));
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public void cancelAppointment(Long id) {
        if (!appointmentRepository.existsById(id)) {
            throw new ResourceNotFoundException("Appointment not found with ID: " + id);
        }
        appointmentRepository.deleteById(id);
    }
}
