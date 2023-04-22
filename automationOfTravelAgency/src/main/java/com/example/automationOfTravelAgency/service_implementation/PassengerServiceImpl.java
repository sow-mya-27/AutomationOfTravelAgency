package com.example.automationOfTravelAgency.service_implementation;

import com.example.automationOfTravelAgency.entity.BookingTable;
import com.example.automationOfTravelAgency.entity.Passenger;
import com.example.automationOfTravelAgency.repository.PassengerRepository;
import com.example.automationOfTravelAgency.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository productRepository;

    @Override
    public List<Passenger> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Passenger update(int id, Passenger driver) {
        return save(driver);
    }

    @Override
    public Passenger findById(int theId) {
        Optional<Passenger> result = productRepository.findById(theId);

        Passenger theProduct = null;

        if (result.isPresent()) {
            theProduct = result.get();
        }
        return theProduct;
    }

    @Override
    public Passenger save(Passenger product) {
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
