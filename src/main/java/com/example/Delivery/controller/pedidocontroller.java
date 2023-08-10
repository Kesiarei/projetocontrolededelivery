package com.example.Delivery.controller;

import java.util.List;

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
public class pedidocontroller<entregaservice> {

    private EntregaService entregaservice;

    public EntregaService getEntregaservice() {
        return entregaservice;
    }

    public void entregacontroller(entregaservice entregaservice) {
        this.entregaservice = (com.example.Delivery.controller.EntregaService) entregaservice;
    }

    @GetMapping
    public List<entrega> listarEntregas() {
        return entregaservice.listarentregas();
    }

    @GetMapping("/{id}")
    public entrega buscarEntregaPorId(@PathVariable Long id) {
        return ((Object) entregaservice.buscarentregaPorId(id))
                .orElseThrow(() -> new IllegalArgumentException("Entrega não encontrada"));
    }

    /**
     * @param entrega
     * @return
     */
    @PostMapping
    public entrega criarEntrega(@RequestBody entrega entrega) {
        return entregaservice.deletarentrega(entrega);
    }

    @PutMapping("/{id}")
    public entrega atualizarEntrega(@PathVariable Long id, @RequestBody entrega entrega) {
        return entregaservice.atualizarentrega(id, entrega);
    }

    /**
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deletarEntrega(@PathVariable Long id) {
        entregaservice.deletarentrega(id);
    }
}