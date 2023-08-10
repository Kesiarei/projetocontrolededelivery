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

import com.example.Delivery.entrega;

@RestController
@RequestMapping("/entregas")
public class entregacontroller {

    private final EntregaService entregaService;

    public entregacontroller(EntregaService entregaService) {
        this.entregaService = entregaService;
    }

    @GetMapping
    public List<entrega> listarEntregas() {
        return entregaService.listarentregas();
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public entrega buscarEntregaPorId(@PathVariable Long id) {
        return entregaService.buscarentregaPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Entrega não encontrada"));
    }

    @PostMapping
    public entrega criarEntrega(@RequestBody entrega entrega) {
        return entregaService.deletarentrega(entrega);
    }

    @PutMapping("/{id}")
    public entrega atualizarEntrega(@PathVariable Long id, @RequestBody entrega entrega) {
        return entregaService.atualizarentrega(id, entrega);
    }

    @DeleteMapping("/{id}")
    public void deletarEntrega(@PathVariable Long id) {
        entregaService.deletarentrega(id);
    }
}