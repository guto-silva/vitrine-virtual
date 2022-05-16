package br.dev.guto.vitrinevirtual.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.dev.guto.vitrinevirtual.model.Categoria;
import br.dev.guto.vitrinevirtual.service.CategoriaServiceImpl;

@RestController
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	CategoriaServiceImpl categoriaServiceImpl;
	
	@GetMapping("/categorias")
	public ResponseEntity<List<Categoria>> recuperarTodasAsCategorias(){	
		return ResponseEntity.ok().body(categoriaServiceImpl.recuperarTodasAsCategorias());
	}
	
	@GetMapping("/categorias/{id}")
	public ResponseEntity<Optional<Categoria>> buscarCategoriaPorId(@PathVariable Integer id){
		return ResponseEntity.ok(categoriaServiceImpl.recuperarCategoriaPorId(id));
	}
	
	@PostMapping("/categorias")
	public ResponseEntity<Categoria> inserirNovaCategoria(@RequestBody Categoria novaCategoria){
		return ResponseEntity.status(201).body(novaCategoria);
	}
	
	@PutMapping("/categorias")
	public ResponseEntity<Categoria> atualizarCategoria(@RequestBody Categoria categoria) {
		return ResponseEntity.ok(categoria);
	}
}
