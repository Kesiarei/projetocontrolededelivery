package com.example.Delivery.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Delivery.cliente;


public interface clienterepository extends JpaRepository<cliente, Long> {
    // Adicione consultas personalizadas, se necessário
}