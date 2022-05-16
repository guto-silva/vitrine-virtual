package br.dev.guto.vitrinevirtual.service;

import java.util.List;
import java.util.Optional;

import br.dev.guto.vitrinevirtual.model.Marca;

public interface IMarcaService {
	public List<Marca> recuperarTodasAsMarcas();
	public Optional<Marca> recuperarMarcaPorId(Integer id);
	public Marca inserirNovaMarca(Marca novaMarca);
	public Marca atualizarMarca(Marca marca);
}
