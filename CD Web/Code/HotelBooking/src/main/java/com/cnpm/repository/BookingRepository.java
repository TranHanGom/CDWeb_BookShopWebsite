package com.cnpm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnpm.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
