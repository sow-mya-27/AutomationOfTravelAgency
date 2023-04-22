package com.example.automationOfTravelAgency.service_implementation;

import com.example.automationOfTravelAgency.entity.BookingTable;
import com.example.automationOfTravelAgency.entity.Route;
import com.example.automationOfTravelAgency.repository.RouteRepository;
import com.example.automationOfTravelAgency.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteRepository productRepository;

    @Override
    public List<Route> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Route update(int id, Route driver) {
        return save(driver);
    }

    @Override
    public Route findById(int theId) {
        Optional<Route> result = productRepository.findById(theId);

        Route theProduct = null;

        if (result.isPresent()) {
            theProduct = result.get();
        }
        return theProduct;
    }

    @Override
    public Route save(Route product) {
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
