package com.example.Delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Delivery.entrega;

public interface entregarepository extends JpaRepository<entrega, Long> {
    // Adicione consultas personalizadas, se necessário
}