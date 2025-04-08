package com.finalproject.hospital.Service;

import com.finalproject.hospital.Entities.Patient;

import java.util.List;

public interface PatientService {
    Patient registerPatient(Patient patient);

    Patient getPatientById(Long id);

    List<Patient> getAllPatients();

    void deletePatient(Long id);
}