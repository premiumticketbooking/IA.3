package com.finalproject.hospital.Service;

import com.finalproject.hospital.Entities.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor registerDoctor(Doctor doctor);
    Doctor getDoctorById(Long id);
    List<Doctor> getAllDoctors();
    void deleteDoctor(Long id);
}
