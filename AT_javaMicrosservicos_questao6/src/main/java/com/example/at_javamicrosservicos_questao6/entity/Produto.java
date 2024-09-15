package com.example.at_javamicrosservicos_questao6.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("produtos")
public class Produto {
    @Id
    private Long id;
    private String nome;
    private double preco;
}
