package classes;

public abstract class Entregador {

	private String nome;
	private int idade;

	public Entregador(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int tempoDeEntraga(int tempo) {

		return tempo;
	}
}
