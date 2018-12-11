package br.com.alura.aulas.modelos;

public class Recibo {

	private int valor;

	public Recibo(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "[Valor Recibo: " + this.valor + ".]";
	}
}
