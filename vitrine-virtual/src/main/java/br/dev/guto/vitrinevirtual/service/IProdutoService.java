package br.dev.guto.vitrinevirtual.service;

import java.util.List;

import br.dev.guto.vitrinevirtual.model.Produto;

public interface IProdutoService {
	
	public List<Produto> recuperarTodosOsProdutos();
	public Produto recuperarProdutoPorId(Integer id);
	public Produto inserirNovoProduto(Produto novoProduto);
	public Produto atualizarProduto(Produto produto);
	
}
