package com.example.at_javamicrosservicos_questao2.repository;

import com.example.at_javamicrosservicos_questao2.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository <Veiculo, Long> {
}
