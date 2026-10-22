package br.com._denao4de.GostosurasDaKarla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com._denao4de.GostosurasDaKarla.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    
}
