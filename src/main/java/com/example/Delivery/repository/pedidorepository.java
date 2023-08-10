package com.example.Delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Delivery.pedido;

public interface pedidorepository extends JpaRepository<pedido, Long> {
    // Adicione consultas personalizadas, se necessário
}