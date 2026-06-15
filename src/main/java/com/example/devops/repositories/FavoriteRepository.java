package com.example.devops.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devops.models.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}