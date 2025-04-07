package com.finalproject.hospital.Entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String specialization;

    @Column(nullable = false)
    private boolean available;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

    // Getters and Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

}