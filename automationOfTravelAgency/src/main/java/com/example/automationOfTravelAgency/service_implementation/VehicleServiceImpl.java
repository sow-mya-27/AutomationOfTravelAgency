package com.example.automationOfTravelAgency.service_implementation;

import com.example.automationOfTravelAgency.entity.BookingTable;
import com.example.automationOfTravelAgency.entity.Vehicle;
import com.example.automationOfTravelAgency.repository.VehicleRepository;
import com.example.automationOfTravelAgency.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository productRepository;

    @Override
    public List<Vehicle> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Vehicle update(int id, Vehicle driver) {
        return save(driver);
    }

    @Override
    public Vehicle findById(int theId) {
        Optional<Vehicle> result = productRepository.findById(theId);

        Vehicle theProduct = null;

        if (result.isPresent()) {
            theProduct = result.get();
        }
        return theProduct;
    }

    @Override
    public Vehicle save(Vehicle product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteById(int id) {
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
