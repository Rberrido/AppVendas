package model;

public class Produto {
	private int id;
	private String nome;
	private float qtdeEstoque;
	private float valorUnitario;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(float qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
