package br.edu.univas.main;

public enum Mes {

	JANEIRO(1, 31),
	FEVEREIRO(2, 28),
	MARCO(3, 31),
	ABRIL(4, 30),
	MAIO(5, 31),
	JUNHO(6, 30),
	JULHO(7, 31),
	AGOSTO(8, 31),
	SETEMBRO(9, 30),
	OUTUBRO(10, 31),
	NOVEMBRO(11, 30),
	DEZEMBRO(12, 31);
	
	private int numero;
	private int quantidadeDias;
	
	Mes(int numero, int quantidadeDias) {
		this.numero = numero;
		this.quantidadeDias = quantidadeDias;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getQuantidadeDias() {
		return quantidadeDias;
	}
}
