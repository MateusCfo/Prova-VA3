package classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	Pedido pedido;

	public Cliente(String nome, Pedido pedido) {
		super();
		this.nome = nome;
		this.pedido = pedido;
	}

	List<Pedido> pedidos = new ArrayList<Pedido>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void relatorio() {
		
		for (Pedido pedido : pedidos) {
			
			pedido.exibirPedido();
		}
	}

	public void dinheiroGasto() {
		
		float totalPedido = 0;
		for (Pedido pedido : pedidos) {
			
			totalPedido =+ pedido.calcularTotal();
		}
		
		System.out.println("Total dos seus pedidos: " + totalPedido);
	}
}
