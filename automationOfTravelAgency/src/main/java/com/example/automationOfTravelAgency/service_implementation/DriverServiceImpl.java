package com.example.automationOfTravelAgency.service_implementation;

import com.example.automationOfTravelAgency.entity.BookingTable;
import com.example.automationOfTravelAgency.entity.Driver;
import com.example.automationOfTravelAgency.repository.DriverRepository;
import com.example.automationOfTravelAgency.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository productRepository;

    @Override
    public List<Driver> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Driver update(int id, Driver driver) {
        return save(driver);
    }

    @Override
    public Driver findById(int theId) {
        Optional<Driver> result = productRepository.findById(theId);

        Driver theProduct = null;

        if (result.isPresent()) {
            theProduct = result.get();
        }
        return theProduct;
    }

    @Override
    public Driver save(Driver product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteBookings(id);
        productRepository.deleteById(id);
    }

    @Override
    public int bookingData(int id) {
        System.out.println(id);
        System.out.println(productRepository.getBookings(id));
        List<BookingTable> a;
        List<Object> bookings=productRepository.getBookings(id);
        return bookings.toArray().length;
    }
}
