package br.dev.guto.vitrinevirtual.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto", nullable = false)
	private Integer idProduto;
	
	@Column(name = "nome_produto", nullable = false, length = 100)
	private String nomeProduto;
	
	@Column(name = "modelo_produto", nullable = false, length = 100)
	private String modeloProduto;
	
	@Column(name = "imagem_produto", nullable = true, length = 255)
	private String imagemProduto;
	
	@Column(name = "descricao_produto", length = 255)
	private String descricaoProduto;
	
	@Column(name = "preco_produto", nullable = false)
	private Double precoProduto;
	
	@Column(name = "estoque_produto", nullable = false)
	private Integer estoqueProduto;
	
	@ManyToOne
	@JoinColumn(name = "id_marca")
	@JsonIgnoreProperties(value = "listaDeProdutos")
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	@JsonIgnoreProperties(value = "listaDeProdutos")
	private Categoria categoria;
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getModeloProduto() {
		return modeloProduto;
	}
	public void setModeloProduto(String modeloProduto) {
		this.modeloProduto = modeloProduto;
	}
	
	public String getImagemProduto() {
		return imagemProduto;
	}
	public void setImagemProduto(String imagemProduto) {
		this.imagemProduto = imagemProduto;
	}
	
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public Double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public Integer getEstoqueProduto() {
		return estoqueProduto;
	}
	public void setEstoqueProduto(Integer estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
