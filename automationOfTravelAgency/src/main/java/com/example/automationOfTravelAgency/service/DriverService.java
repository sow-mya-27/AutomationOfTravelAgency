package com.example.automationOfTravelAgency.service;

import com.example.automationOfTravelAgency.entity.Driver;

import java.util.List;

public interface DriverService {

    public List<Driver> findAll();

    Driver update(int id, Driver driver);

    public Driver findById(int theId);

    public Driver save(Driver driver);

    public void deleteById(int Id);

    public int bookingData(int id);
}
