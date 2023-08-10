package com.example.Delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Delivery.pedido;
import com.example.Delivery.repository.pedidorepository;

@Service
public class pedidoservice {

    private final pedidoservice pedidoRepository;

    /**
     * @param pedidorepository
     */
    public pedidoservice(pedidorepository pedidorepository) {
        this.pedidoRepository = (pedidoservice) pedidorepository;
    }

    public List<pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    private List<pedido> findAll() {
        return null;
    }

    public Optional<pedido> buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    private Optional<pedido> findById(Long id) {
        return null;
    }

    public pedido criarPedido(pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    private pedido save(pedido pedido) {
        return null;
    }

    public pedido atualizarPedido(Long id, pedido pedido) {
        pedido.setId(id);
        return pedidoRepository.save(pedido);
    }

    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }

    private void deleteById(Long id) {
    }
}