package com.example.automationOfTravelAgency.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "age")
    private String age;

    @OneToMany(mappedBy = "passenger", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private List<BookingTable> bookingTables;

    public Passenger(){}

    public Passenger(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
