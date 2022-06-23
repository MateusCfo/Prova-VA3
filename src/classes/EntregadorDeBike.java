package classes;

public class EntregadorDeBike extends Entregador {

	Loja loja;
	public EntregadorDeBike(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public int tempoDeEntraga(int tempo) {
		
		tempo = 4 * loja.getDistancia(); 
		return tempo;
	}

}
