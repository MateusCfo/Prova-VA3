package classes;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
	
	private int id;
	Entregador entregador;
	Produto produto;
	
	
	public Pedido(int id, Entregador entregador, Produto produto, List<Produto> produtos) {
		super();
		this.id = id;
		this.entregador = entregador;
		this.produto = produto;
		this.produtos = produtos;
	}

	List<Produto> produtos = new ArrayList<Produto>();
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void exibirPedido() {
		System.out.println("Pedido");
		System.out.println("Id pedido: "+ getId());
		System.out.println("Entregador: " + entregador);
		System.out.println("Itens Pedidos: " + produtos);
		System.out.println("Tempo de entrega: " + entregador.tempoDeEntraga(produto.loja.getDistancia()));
		System.out.println("Total pedido: "+ calcularTotal());
	}
	
	public float calcularTotal() {
		float soma = 0;
		for (Produto produto : produtos) {
			
			soma =+ produto.getValor();
		}
		return soma;
	}
}
