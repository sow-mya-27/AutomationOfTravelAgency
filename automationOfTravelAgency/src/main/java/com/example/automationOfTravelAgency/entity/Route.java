package com.example.automationOfTravelAgency.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="from")
    private String from;

    @Column(name = "to")
    private String to;

    @Column(name = "noOfKms")
    private String noOfKms;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<BookingTable> bookingTables;

    public Route(){}

    public Route(String from, String to, String noOfKms) {
        this.from = from;
        this.to = to;
        this.noOfKms=noOfKms;
    }



}
