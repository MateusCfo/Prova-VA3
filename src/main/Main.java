package main;

import classes.Cliente;
import classes.EntregadorDeBike;
import classes.EntregadorDeDrone;
import classes.EntregadorDeMoto;
import classes.Loja;
import classes.Pedido;
import classes.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntregadorDeBike entreBike = new EntregadorDeBike("Mateus", 28);
		EntregadorDeMoto entreMoto = new EntregadorDeMoto("Mateus", 28);
		EntregadorDeDrone entreDrone = new EntregadorDeDrone("Mateus", 28);

		Loja loja = new Loja("Canjica Soft", "Rua A", 3);

		Produto canjica = new Produto("Canjica Branca", 5, loja);
		Produto canjicaPacoca = new Produto("Canjica c/ paçoca", 7, loja);
		Produto canjicaCoco = new Produto("Canjica c/ coco", 6, loja);

		Pedido pedido01 = new Pedido(0, entreBike, canjicaCoco, null);
		Pedido pedido02 = new Pedido(0, entreMoto, canjicaCoco, null);
		Pedido pedido03 = new Pedido(0, entreDrone, canjicaCoco, null);

		Cliente cliente = new Cliente("Maria", pedido03);
		
		cliente.relatorio();
		cliente.dinheiroGasto();
		
		pedido01.exibirPedido();
		pedido01.calcularTotal();
		
	}

}
