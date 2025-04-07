package com.finalproject.hospital.Repository;

import com.finalproject.hospital.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Additional query methods can be defined here if required
}