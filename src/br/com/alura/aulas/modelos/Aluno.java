package br.com.alura.aulas.modelos;

public class Aluno {
	
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		if(nome == null) {
			throw new NullPointerException("O campo nome não pode ser nulo.");
		}
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.matricula + "]";
	}

	//AUTO GENERATED CODE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	//AUTO GENERATED CODE
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object aluno) {
//		Aluno outroAluno = (Aluno) aluno;
//		return this.nome.equals(outroAluno.nome);
//	}
//	
//	@Override
//	public int hashCode() {
		//Retorna um HashCode(int) de acordo com as letras do nome do aluno
//		return this.nome.hashCode();
//	}
//	
}
