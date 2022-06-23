package classes;

public class EntregadorDeMoto extends Entregador{

	Loja loja;
	public EntregadorDeMoto(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
public int tempoDeEntraga(int tempo) {
		
		tempo = 2 * loja.getDistancia(); 
		return tempo;
	}

}
