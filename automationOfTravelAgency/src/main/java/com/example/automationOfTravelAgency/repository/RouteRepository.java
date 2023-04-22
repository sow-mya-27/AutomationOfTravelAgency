package com.example.automationOfTravelAgency.repository;

import com.example.automationOfTravelAgency.entity.Route;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route,Integer> {

    @Query(value = "select * from bookingTable where route_id = ?",
            nativeQuery = true)
    List<Object> getBookings(Integer id);

    @Modifying
    @Transactional
    @Query(value = "delete from bookingTable where route_id = ?",
            nativeQuery = true)
    void deleteBookings(Integer id);
}
