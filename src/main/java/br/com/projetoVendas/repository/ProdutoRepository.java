package br.com.projetoVendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoVendas.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
