package com.example.automationOfTravelAgency.controller;

import com.example.automationOfTravelAgency.entity.Route;
import com.example.automationOfTravelAgency.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/route")
public class RouteController {

    @Autowired
    RouteService productService;

    public void check(int id) {
        Route theProduct = productService.findById(id);
    }

    @PostMapping("/save")
    public @ResponseBody String addDriver(@RequestBody Route route) {
        productService.save(route);
        return "Driver Added Successfully";
    }

    @GetMapping("/list")
    public @ResponseBody List<Route> getAllDrivers() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Route getById(@PathVariable int id) {
        return productService.findById(id);
    }

    @PutMapping("update/{id}")
    public @ResponseBody Route update(@RequestBody Route driver, @PathVariable int id) {
        driver.setId(id);
        return productService.update(id, driver);
    }

    @DeleteMapping("delete/{id}")
    public @ResponseBody String delete(@PathVariable int id) {
        productService.deleteById(id);
        return "Driver Deleted Successfully";
    }

    @GetMapping("bookings/{id}")
    public @ResponseBody int getBookings(@PathVariable int id){
        return productService.bookingData(id);
    }
}