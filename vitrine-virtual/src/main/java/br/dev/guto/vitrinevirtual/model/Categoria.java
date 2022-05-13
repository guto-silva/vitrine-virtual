package br.dev.guto.vitrinevirtual.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria", nullable = false)
	private Integer idCategoria;
	
	@Column(name = "nome_categoria", nullable = false, length = 100)
	private String nomeCategoria;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
	@JsonIgnoreProperties(value="categoria")
	private List<Produto> listaProdutos;
	
	
	public Integer getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	public List<Produto> getProduto() {
		return listaProdutos;
	}
	public void setProduto(List<Produto> produto) {
		this.listaProdutos = produto;
	}
	
	
}
