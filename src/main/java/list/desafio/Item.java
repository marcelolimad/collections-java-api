package main.java.list.desafio;

import java.util.List;

public class Item {
	
	String nome;
	double preco;
	int quantidade;
	
	
	public Item(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	public double calcularPrecoTotal() {
		return quantidade * preco;
	}
	
	
	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
