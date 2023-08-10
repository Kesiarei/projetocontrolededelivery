package com.example.Delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Delivery.entrega;

@Service
public class entregaservice {

    private final entregarepository entregarepository;

    public entregarepository getEntregarepository() {
        return entregarepository;
    }

    public entregaservice(entregarepository entregarepository) {
        this.entregarepository = entregarepository;
    }

    public List<entrega> listarEntregas() {
        return entregarepository.findAll();
    }

    public Optional<entrega> buscarEntregaPorId(Long id) {
        return entregarepository.findById(id);
    }

    public entrega criarEntrega(entrega entrega) {
        return entregarepository.save(entrega);
    }

    public entrega atualizarEntrega(Long id, entrega entrega) {
        entrega.setId(id);
        return entregarepository.save(entrega);
    }

    public void deletarEntrega(Long id) {
        entregarepository.deleteById(id);
    }
}
