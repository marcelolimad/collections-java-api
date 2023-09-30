package main.java.list.desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	
	private List<Item> CarrinhoList;
	
	public CarrinhoDeCompras() {
		this.CarrinhoList = new ArrayList<>();
	}
	
	
	public void adcionarItem(String nome, double preco, int quantidade) {
		CarrinhoList.add(new Item( nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		if(!CarrinhoList.isEmpty()) {
         for(Item i : CarrinhoList) {
          if(i.getNome().equalsIgnoreCase(nome)) {
        	  itemParaRemover.add(i);
        	  
          }
        	 
         }
         CarrinhoList.removeAll(itemParaRemover);
         
         }else {
        	 System.out.println("A Lista está vazia");
         }
			
	}
	
	public void CalcularValorTotal() {
		double precoTotal = 0.0;
		for (Item item: CarrinhoList ) {
			precoTotal += item.calcularPrecoTotal();
		}
		 System.out.println("Valor total: " + precoTotal);
	}
	
	public void exibirItens() {
		if(!CarrinhoList.isEmpty()) {
			System.out.println(CarrinhoList);
		}else {
			System.out.println("A Lista está vazia");
		}
	}
	
	
}
