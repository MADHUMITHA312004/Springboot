package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine,Integer>
 {
    
}
