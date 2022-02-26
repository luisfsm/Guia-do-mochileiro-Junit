package br.com.alura.tdd.modelo;

public class Produtos {

	private String nome;
	private Double price;
	
	public Produtos(String nome, Double price) {
		super();
		this.nome = nome;
		this.price = price;
	}
	
	public Produtos() {
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
