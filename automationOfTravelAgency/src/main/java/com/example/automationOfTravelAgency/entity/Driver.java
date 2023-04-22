package com.example.automationOfTravelAgency.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "driver")
public class Driver {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private int rating;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private List<BookingTable> bookingTables;

    public Driver(){

    }

    public Driver(  String name, int rating) {
        this.name = name;
        this.rating = rating;
    }


}
