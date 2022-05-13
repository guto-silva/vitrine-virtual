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
@Table(name = "marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_marca", nullable = false)
	private Integer idMarca;
	
	@Column(name = "nome_marca", nullable = false, length = 100)
	private String nomeMarca;
	
	@Column(name="imagem_marca", length = 255)
	private String imagemMarca;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "marca")
	@JsonIgnoreProperties(value="marca")
	private List<Produto> listaProdutos;
	
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public String getNomeMarca() {
		return nomeMarca;
	}
	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	public String getImagemMarca() {
		return imagemMarca;
	}
	public void setImagemMarca(String imagemMarca) {
		this.imagemMarca = imagemMarca;
	}
	public List<Produto> getProduto() {
		return listaProdutos;
	}
	public void setProduto(List<Produto> produto) {
		this.listaProdutos = produto;
	}
}
