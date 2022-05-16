package br.dev.guto.vitrinevirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.guto.vitrinevirtual.dao.MarcaDAO;
import br.dev.guto.vitrinevirtual.model.Marca;

@Service
public class MarcaServiceImpl implements IMarcaService {
	
	@Autowired
	MarcaDAO marcaDao;

	@Override
	public List<Marca> recuperarTodasAsMarcas() {
		return (List<Marca>)marcaDao.findAll();
	}

	@Override
	public Marca recuperarMarcaPorId(Integer id) {
		return null;
	}

	@Override
	public Marca inserirNovaMarca(Marca novaMarca) {
		return null;
	}

	@Override
	public Marca atualizarMarca(Marca marca) {
		return null;
	}
	
}
