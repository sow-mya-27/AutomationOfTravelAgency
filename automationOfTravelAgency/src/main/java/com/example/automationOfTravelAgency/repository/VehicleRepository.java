package com.example.automationOfTravelAgency.repository;

import com.example.automationOfTravelAgency.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

    @Query(value = "select * from bookingTable where vehicle_id = ?",
            nativeQuery = true)
    List<Object> getBookings(Integer id);

}
