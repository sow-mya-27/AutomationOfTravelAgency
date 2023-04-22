package com.example.automationOfTravelAgency.service;

import com.example.automationOfTravelAgency.entity.Vehicle;

import java.util.List;

public interface VehicleService {

    public List<Vehicle> findAll();

    Vehicle update(int id, Vehicle driver);

    public Vehicle findById(int theId);

    public Vehicle save(Vehicle vehicle);

    public void deleteById(int Id);

    public int bookingData(int id);

}
