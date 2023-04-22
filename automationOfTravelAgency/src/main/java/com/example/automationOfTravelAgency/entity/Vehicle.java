package com.example.automationOfTravelAgency.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="ve_name")
    private String ve_name;

    @Column(name = "vehicle_type")
    private String vehicle_type;

    @Column(name = "totalSeats")
    private String totalSeats;

    @Column(name = "ac_nonAc")
    private String ac_nonAc;

    @Column(name = "per_km_type")
    private String per_km_type;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<BookingTable> bookingTables;

    public Vehicle(){}

    public Vehicle(String ve_name, String vehicle_type, String totalSeats, String ac_nonAc, String per_km_type) {
        this.ve_name = ve_name;
        this.vehicle_type = vehicle_type;
        this.totalSeats = totalSeats;
        this.ac_nonAc = ac_nonAc;
        this.per_km_type = per_km_type;
    }
}
