package classes;

public class Produto {
	private String nome;
	private float valor;
	
	Loja loja;

	public Produto(String nome, float valor, Loja loja) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.loja = loja;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
