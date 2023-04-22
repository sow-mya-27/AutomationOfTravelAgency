package com.example.automationOfTravelAgency.controller;

import com.example.automationOfTravelAgency.entity.BookingTable;
import com.example.automationOfTravelAgency.entity.Driver;
import com.example.automationOfTravelAgency.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverService productService;

    public void check(int id) {
        Driver theProduct = productService.findById(id);
    }

    @PostMapping("/save")
    public @ResponseBody String addDriver(@RequestBody Driver driver) {
        productService.save(driver);
        return "Driver Added Successfully";
    }

    @GetMapping("/list")
    public @ResponseBody List<Driver> getAllDrivers() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Driver getById(@PathVariable int id) {
        return productService.findById(id);
    }

    @PutMapping("update/{id}")
    public @ResponseBody Driver update(@RequestBody Driver driver, @PathVariable int id) {
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