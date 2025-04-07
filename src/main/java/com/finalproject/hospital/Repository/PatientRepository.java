package com.finalproject.hospital.Repository;

import com.finalproject.hospital.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Additional query methods can be defined here if required
}
