package com.example.automationOfTravelAgency.controller;

import com.example.automationOfTravelAgency.entity.Vehicle;
import com.example.automationOfTravelAgency.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    VehicleService productService;

    public void check(int id) {
        Vehicle theProduct = productService.findById(id);
    }

    @PostMapping("/save")
    public @ResponseBody String addDriver(@RequestBody Vehicle route) {
        productService.save(route);
        return "Driver Added Successfully";
    }

    @GetMapping("/list")
    public @ResponseBody List<Vehicle> getAllDrivers() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Vehicle getById(@PathVariable int id) {
        return productService.findById(id);
    }

    @PutMapping("update/{id}")
    public @ResponseBody Vehicle update(@RequestBody Vehicle driver, @PathVariable int id) {
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