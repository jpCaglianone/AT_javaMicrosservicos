package com.example.at_javamicrosservicos_questao6.repository;

import com.example.at_javamicrosservicos_questao6.entity.Produto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ProdutoRepository extends R2dbcRepository<Produto, Long> {
    Mono<Produto> findByNome(String nome);
}
