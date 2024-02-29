package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer>
{
    
}
