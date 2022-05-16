package br.dev.guto.vitrinevirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.guto.vitrinevirtual.dao.ProdutoDAO;
import br.dev.guto.vitrinevirtual.model.Produto;

@Service
public class ProdutoServiceImpl implements IProdutoService {
	
	@Autowired
	ProdutoDAO produtoDao;
	
	@Override
	public List<Produto> recuperarTodosOsProdutos() {
		return (List<Produto>)produtoDao.findAll();
	}

	@Override
	public Produto recuperarProdutoPorId(Integer id) {
		return null;
	}

	@Override
	public Produto inserirNovoProduto(Produto novoProduto) {
		return null;
	}

	@Override
	public Produto atualizarProduto(Produto produto) {
		return null;
	}

}
