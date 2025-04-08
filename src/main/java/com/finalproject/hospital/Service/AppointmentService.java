package com.finalproject.hospital.Service;

import com.finalproject.hospital.entity.Appointment;
import java.util.List;

public interface AppointmentService {
    Appointment scheduleAppointment(Appointment appointment);

    Appointment getAppointmentById(Long id);

    List<Appointment> getAllAppointments();

    void deleteAppointment(Long id);
}