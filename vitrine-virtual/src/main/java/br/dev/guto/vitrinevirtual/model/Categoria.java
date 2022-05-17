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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria", nullable = false)
	private Integer idCategoria;
	
	@NotBlank(message = "Nome da categoria é obrigatório")
	@Size(max = 100)
	@Column(name = "nome_categoria", nullable = false, length = 100)
	private String nomeCategoria;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
	@JsonIgnoreProperties(value = "categoria")
	private List<Produto> listaDeProdutos;
	 
	
	public Integer getIdCategoria(){
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria){
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria(){
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria){
		this.nomeCategoria = nomeCategoria;
	}

	
	public List<Produto> getListaDeProdutos(){
		return listaDeProdutos;
	}
	  
	public void setListaDeProdutos(List<Produto> listaDeProdutos){
		this.listaDeProdutos = listaDeProdutos;
	}
	 
}
