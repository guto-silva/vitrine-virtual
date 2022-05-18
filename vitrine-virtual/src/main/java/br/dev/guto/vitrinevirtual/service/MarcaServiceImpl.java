package br.dev.guto.vitrinevirtual.service;

import java.util.List;
import java.util.Optional;

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
		try {
			return (List<Marca>)marcaDao.findAll();
		} catch(Exception e) {
			throw new RuntimeException("Erro ao buscar marcas!");
		}
	}

	@Override
	public Optional<Marca> recuperarMarcaPorId(Integer id) {
		try {
			return marcaDao.findById(id);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao recuperar marcas por id!");
		}
	}

	@Override
	public Marca inserirNovaMarca(Marca novaMarca) {
		return marcaDao.save(novaMarca);
	}

	@Override
	public Marca atualizarMarca(Marca marca) {
		return marcaDao.save(marca);
	}
	
}
