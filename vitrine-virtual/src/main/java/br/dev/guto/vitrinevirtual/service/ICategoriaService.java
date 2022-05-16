package br.dev.guto.vitrinevirtual.service;

import java.util.List;

import br.dev.guto.vitrinevirtual.model.Categoria;

public interface ICategoriaService {
	public List<Categoria> recuperarTodasAsCategorias();
	public Categoria recuperarCategoriaPorId(Integer id);
	public Categoria inserirNovaCategoria(Categoria novaCategoria);
	public Categoria atualizarCategoria(Categoria categoria);
}
