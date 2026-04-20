package com.example.blooddonar.repository;

import com.example.blooddonar.entity.Donar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DonarRepository extends JpaRepository<Donar, Integer> {


}