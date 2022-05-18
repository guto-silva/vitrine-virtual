package br.dev.guto.vitrinevirtual.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.dev.guto.vitrinevirtual.model.Marca;
import br.dev.guto.vitrinevirtual.service.MarcaServiceImpl;

@RestController
@CrossOrigin("*")
public class MarcaController {
	
	@Autowired
	MarcaServiceImpl marcaServiceImpl;
	
	@GetMapping("/marcas")
	public ResponseEntity<List<Marca>> recuperarTodasAsMarcas(){
		return ResponseEntity.ok().body(marcaServiceImpl.recuperarTodasAsMarcas());
	}
	
	@GetMapping("/marcas/{id}")
	public ResponseEntity<Optional<Marca>> bucarMarcaPorId(@PathVariable Integer id){
		return ResponseEntity.ok(marcaServiceImpl.recuperarMarcaPorId(id));
	}
	
	@PostMapping("/marcas")
	public ResponseEntity<Marca> inserirNovaMarca(@Valid @RequestBody Marca novaMarca){
		return ResponseEntity.status(201).body(marcaServiceImpl.inserirNovaMarca(novaMarca));
	}
	
	@PutMapping("/marcas")
	public ResponseEntity<Marca> atualizarMarca(@Valid @RequestBody Marca marca){
		return ResponseEntity.ok(marcaServiceImpl.atualizarMarca(marca));
	}
	
}
