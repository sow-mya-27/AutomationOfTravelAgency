package com.example.automationOfTravelAgency.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "bookingTable")
public class BookingTable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "pass_id")
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    @Column(name = "date_of_travel")
    private Date dateOfTravel;

    @Column(name = "date_of_booking")
    private Date dateOfBooking;

    @Column(name = "rate_to_pay")
    private Double rateToPay;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "did")
    @JsonIgnore
    private Driver driver;

    public BookingTable(){}

    public BookingTable(int id, Passenger passenger, Route route, Vehicle vehicle, Date dateOfTravel, Date dateOfBooking, Double rateToPay, Driver driver) {
        this.id = id;
        this.passenger = passenger;
        this.route = route;
        this.vehicle = vehicle;
        this.dateOfTravel = dateOfTravel;
        this.dateOfBooking = dateOfBooking;
        this.rateToPay = rateToPay;
        this.driver = driver;
    }
}
