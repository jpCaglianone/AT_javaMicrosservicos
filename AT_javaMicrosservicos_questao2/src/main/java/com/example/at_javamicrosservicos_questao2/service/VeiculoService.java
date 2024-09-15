package com.example.at_javamicrosservicos_questao2.service;

import com.example.at_javamicrosservicos_questao2.repository.VeiculoRepository;
import com.example.at_javamicrosservicos_questao2.entity.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarTodosVeiculos() {
        return veiculoRepository.findAll();
    }

    public Veiculo adicionarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo alterarVeiculo(Long id, Veiculo veiculo) {
        Veiculo veiculoExistente = veiculoRepository.findById(id).orElseThrow();
        veiculoExistente.setMarca(veiculo.getMarca());
        veiculoExistente.setModelo(veiculo.getModelo());
        veiculoExistente.setAno(veiculo.getAno());
        return veiculoRepository.save(veiculoExistente);
    }

    public Veiculo excluirVeiculo(Long id) {
        return veiculoRepository.findById(id).orElseThrow();
    }

}

