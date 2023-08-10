package com.example.Delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Delivery.cliente;
@RestController
@RequestMapping("/clientes")
public class clientecontroller {

    private final clienteservice clienteservice;

    public clienteservice getClienteservice() {
        return clienteservice;
    }

    public clientecontroller(clienteservice clienteService) {
        this.clienteservice = clienteService;
    }

    @GetMapping
    public List<cliente> listarclientes() {
        return clienteservice.listarclientes();
    }

    @GetMapping("/{id}")
    public cliente buscarClientePorId(@PathVariable Long id) {
        return ((Object) clienteservice.buscarclientePorId(id))
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
    }

    @PostMapping
    public cliente criarCliente(@RequestBody cliente cliente) {
        return clienteservice.criarcliente(cliente);
    }

    @PutMapping("/{id}")
    public cliente atualizarCliente(@PathVariable Long id, @RequestBody cliente cliente) {
        return clienteservice.atualizarcliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        clienteservice.criarcliente(id);
    }
}