package br.dev.guto.vitrinevirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.guto.vitrinevirtual.dao.CategoriaDAO;
import br.dev.guto.vitrinevirtual.model.Categoria;


@Service
public class CategoriaServiceImpl implements ICategoriaService {
	
	@Autowired
	private CategoriaDAO categoriaDao;
	
	@Override
	public List<Categoria> recuperarTodasAsCategorias() {
		try {
			return (List<Categoria>) categoriaDao.findAll();
		} catch(Exception e) {
			throw new RuntimeException("Erro ao buscar categorias");
		}
	}

	@Override
	public Categoria recuperarCategoriaPorId(Integer id) {
		
		return null;
	}

	@Override
	public Categoria inserirNovaCategoria(Categoria novaCategoria) {
		
		return null;
	}

	@Override
	public Categoria atualizarCategoria(Categoria categoria) {
		
		return null;
	}

}
