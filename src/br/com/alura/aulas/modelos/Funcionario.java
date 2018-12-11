package br.com.alura.aulas.modelos;

public class Funcionario implements Comparable<Funcionario>{

	private String nome;
	private int idade;
	
	
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Funcionario funcionario) {
		return Integer.compare(this.idade, funcionario.idade);
	}
}
