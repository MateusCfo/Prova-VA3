package classes;

public class Loja {

	private String nome;
	private String endereco;
	private int distancia;
	public Loja(String nome, String endereco, int distancia) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.distancia = distancia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	
}
