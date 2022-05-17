package br.dev.guto.vitrinevirtual.service;

import java.util.List;
import java.util.Optional;

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
		try {
			return (List<Produto>)produtoDao.findAll();
		} catch(Exception e) {
			throw new RuntimeException("Erro ao recuperar produtos!");
		}
	}

	@Override
	public Optional<Produto> recuperarProdutoPorId(Integer id) {
		try {
			return produtoDao.findById(id);
		} catch(Exception e) {
			throw new RuntimeException("Erro ao recuperar produto por id!");
		}
	}

	@Override
	public Produto inserirNovoProduto(Produto novoProduto) {
		return produtoDao.save(novoProduto);
	}

	@Override
	public Produto atualizarProduto(Produto produto) {
		return produtoDao.save(produto);
	}

}
