package com.example.automationOfTravelAgency.service;

import com.example.automationOfTravelAgency.entity.Route;

import java.util.List;

public interface RouteService {

    public List<Route> findAll();

    Route update(int id, Route driver);

    public Route findById(int theId);

    public Route save(Route user);

    public void deleteById(int Id);

    public int bookingData(int id);


}
