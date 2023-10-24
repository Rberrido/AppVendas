package model;

public class VendaProduto {
	private int idVenda;
	private int idProduto;
	private float qtde;
	private float valorUnitario;
	private float valorTotalProduto;

	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public float getQtde() {
		return qtde;
	}
	public void setQtde(float qtde) {
		this.qtde = qtde;
	}
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public float getValorTotalProduto() {
		return valorTotalProduto;
	}
	public void setValorTotalProduto(float valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}
}