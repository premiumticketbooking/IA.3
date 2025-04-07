package com.finalproject.hospital.Repository;

import com.finalproject.hospital.Entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // Additional query methods can be defined here if required
}