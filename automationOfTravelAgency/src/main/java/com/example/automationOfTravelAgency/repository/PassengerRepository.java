package com.example.automationOfTravelAgency.repository;

import com.example.automationOfTravelAgency.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {

    @Query(value = "select * from bookingTable where pass_id = ?",
            nativeQuery = true)
    List<Object> getBookings(Integer id);
}
