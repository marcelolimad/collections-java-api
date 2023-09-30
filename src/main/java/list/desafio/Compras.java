package main.java.list.desafio;

public class Compras {
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		
		compras.adcionarItem("Caneta", 15.0, 10);
		compras.adcionarItem("Lapis", 10.0, 5);
		compras.adcionarItem("Borracha", 11.0, 15);

		
		
		System.out.println("Você tem");
		compras.exibirItens();
		
		compras.CalcularValorTotal();
		
		compras.removerItem("Borracha");
		
		System.out.println("Você tem Agora");
		compras.exibirItens();
		
		compras.CalcularValorTotal();
	}

}
