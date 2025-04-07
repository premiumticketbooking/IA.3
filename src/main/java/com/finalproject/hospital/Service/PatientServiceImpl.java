package com.finalproject.hospital.Service;

import com.finalproject.hospital.Entities.Patient;
import com.finalproject.hospital.Repository.PatientRepository;
import com.finalproject.hospital.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient registerPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        Optional<Patient> patient = patientRepository.findById(id);
        if (patient.isPresent()) {
            return patient.get();
        } else {
            throw new ResourceNotFoundException("Patient not found with ID: " + id);
        }
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
