package com.example.devops.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devops.models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}