package com.example.devops.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devops.models.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}