package classes;

public class EntregadorDeDrone extends Entregador {

	Loja loja;
	
	public EntregadorDeDrone(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public int tempoDeEntraga(int tempo) {
		
		tempo = 1 * loja.getDistancia(); 
		return tempo;
	}
}
