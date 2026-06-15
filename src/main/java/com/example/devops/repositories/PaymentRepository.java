package com.example.devops.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devops.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}