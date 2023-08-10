package com.example.Delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Delivery.cliente;
import com.example.Delivery.repository.clienterepository;

@Service
public class clienteservice {

    private final clienterepository clienteRepository;

    /**
     * @param clienteRepository
     */
    public clienteservice(clienterepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public cliente criarCliente(cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public cliente atualizarCliente(Long id, cliente cliente) {
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
