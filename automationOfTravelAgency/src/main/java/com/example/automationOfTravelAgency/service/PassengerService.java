package com.example.automationOfTravelAgency.service;

import com.example.automationOfTravelAgency.entity.Passenger;

import java.util.List;

public interface PassengerService {
    public List<Passenger> findAll();

    Passenger update(int id, Passenger driver);

    public Passenger findById(int theId);

    public Passenger save(Passenger passenger);

    public void deleteById(int Id);

    public int bookingData(int id);

}
