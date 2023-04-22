package com.example.automationOfTravelAgency.controller;

import com.example.automationOfTravelAgency.entity.Passenger;
import com.example.automationOfTravelAgency.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    PassengerService productService;

    public void check(int id) {
        Passenger theProduct = productService.findById(id);
    }

    @PostMapping("/save")
    public @ResponseBody String addDriver(@RequestBody Passenger route) {
        productService.save(route);
        return "Driver Added Successfully";
    }

    @GetMapping("/list")
    public @ResponseBody List<Passenger> getAllDrivers() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Passenger getById(@PathVariable int id) {
        return productService.findById(id);
    }

    @PutMapping("update/{id}")
    public @ResponseBody Passenger update(@RequestBody Passenger driver, @PathVariable int id) {
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