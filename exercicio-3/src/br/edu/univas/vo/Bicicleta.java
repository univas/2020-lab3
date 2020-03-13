package br.edu.univas.vo;

public class Bicicleta {

	private String marca;
	private String cor;
	private float preco;
	private Pneu pneuDianteiro;
	private Pneu pneuTraseiro;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Pneu getPneuDianteiro() {
		return pneuDianteiro;
	}
	public void setPneuDianteiro(Pneu pneuDianteiro) {
		this.pneuDianteiro = pneuDianteiro;
	}
	public Pneu getPneuTraseiro() {
		return pneuTraseiro;
	}
	public void setPneuTraseiro(Pneu pneuTraseiro) {
		this.pneuTraseiro = pneuTraseiro;
	}
}
