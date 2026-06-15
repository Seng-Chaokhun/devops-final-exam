package com.example.devops.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devops.models.Terrain;

public interface TerrainRepository extends JpaRepository<Terrain, Long> {
}