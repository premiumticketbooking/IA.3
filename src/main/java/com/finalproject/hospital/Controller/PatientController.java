package com.finalproject.hospital.Controller;

import com.finalproject.hospital.Entities.Patient;
import com.finalproject.hospital.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")




public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/register")
    public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient) {
        // logic to save patient
        return ResponseEntity.ok(patient);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        Patient patient = patientService.getPatientById(id);
        return ResponseEntity.ok(patient);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients = patientService.getAllPatients();
        return ResponseEntity.ok(patients);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable long id) {
        patientService.deletePatient(id);
        return ResponseEntity.ok("Patient deleted successfully!");
    }
}