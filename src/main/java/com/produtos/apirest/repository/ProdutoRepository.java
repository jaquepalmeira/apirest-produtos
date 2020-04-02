package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    //possui varios metodos prontos de persistencia, como save, delete, findAll etc
    Produto findById(long id);
}
