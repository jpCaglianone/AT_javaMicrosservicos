package com.example.at_javamicrosservicos_questao2.controller;

import com.example.at_javamicrosservicos_questao2.entity.Veiculo;
import com.example.at_javamicrosservicos_questao2.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> listarVeiculos() {
        return veiculoService.listarTodosVeiculos();
    }

    @PostMapping
    public Veiculo adicionarVeiculo(@RequestBody Veiculo Veiculo) {
        return veiculoService.adicionarVeiculo(Veiculo);
    }

    @PutMapping("/{id}")
    public Veiculo updateVeiculo(@PathVariable Long id, @RequestBody Veiculo Veiculo) {
        return veiculoService.alterarVeiculo(id, Veiculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable Long id) {
        veiculoService.excluirVeiculo(id);
        return ResponseEntity.noContent().build();
    }
}
