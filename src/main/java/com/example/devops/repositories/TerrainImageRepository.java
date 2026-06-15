package com.example.devops.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devops.models.TerrainImage;

public interface TerrainImageRepository extends JpaRepository<TerrainImage, Long> {
}