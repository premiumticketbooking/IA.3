package com.finalproject.hospital.Controller;

import com.finalproject.hospital.Entities.Doctor;
import com.finalproject.hospital.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping("/register")
	public ResponseEntity<Doctor> registerDoctor(@RequestBody Doctor doctor) {
		Doctor registeredDoctor = doctorService.registerDoctor(doctor);
		return ResponseEntity.ok(registeredDoctor);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id) {
		Doctor doctor = doctorService.getDoctorById(id);
		return ResponseEntity.ok(doctor);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Doctor>> getAllDoctors() {
		List<Doctor> doctors = doctorService.getAllDoctors();
		return ResponseEntity.ok(doctors);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctor(id);
		return ResponseEntity.ok("Doctor deleted successfully!");
	}
}
