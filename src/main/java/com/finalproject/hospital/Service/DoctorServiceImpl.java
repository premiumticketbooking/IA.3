package com.finalproject.hospital.Service;

import com.finalproject.hospital.Entities.Doctor;
import com.finalproject.hospital.Repository.DoctorRepository;
import com.finalproject.hospital.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor registerDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor getDoctorById(Long id) {
        Optional<Doctor> doctor = doctorRepository.findById(id);
        if (doctor.isPresent()) {
            return doctor.get();
        } else {
            throw new ResourceNotFoundException("Doctor not found with ID: " + id);
        }
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}