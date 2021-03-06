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

import br.dev.guto.vitrinevirtual.model.Produto;
import br.dev.guto.vitrinevirtual.service.ProdutoServiceImpl;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	ProdutoServiceImpl produtoServiceImpl;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> recuperarTodosOsProdutos(){
		return ResponseEntity.ok().body(produtoServiceImpl.recuperarTodosOsProdutos());
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Optional<Produto>> recuperarProdutoPorId(@PathVariable Integer id){
		return ResponseEntity.ok(produtoServiceImpl.recuperarProdutoPorId(id));
	}
	
	@PostMapping("/produtos")
	public ResponseEntity<Produto> inserirNovoProduto(@Valid @RequestBody Produto novoProduto){
		return ResponseEntity.status(201).body(produtoServiceImpl.inserirNovoProduto(novoProduto));
	}
	
	@PutMapping()
	public ResponseEntity<Produto> atualizarProduto(@Valid @RequestBody Produto produto){
		return ResponseEntity.ok(produtoServiceImpl.atualizarProduto(produto));
	}
}
