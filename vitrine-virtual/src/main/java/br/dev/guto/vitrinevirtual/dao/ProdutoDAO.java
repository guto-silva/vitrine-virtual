package br.dev.guto.vitrinevirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.dev.guto.vitrinevirtual.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{

}
