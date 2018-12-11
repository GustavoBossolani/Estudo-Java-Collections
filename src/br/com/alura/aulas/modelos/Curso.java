package br.com.alura.aulas.modelos;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	//Salva um aluno de acordo com o numero da metricula, ou seja para cada numero de matricula um aluno(Key: numeroMatricula, Value:Aluno)
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return this.nome;
	}

	public String getInstrutor() {
		return this.instrutor;
	}

	public List<Aula> getAulas() {
		/*
		 * Este método do Collections retorna uma cópia da lista de aulas que não pode ser alterada
		 * Esssa lista é apenas um "Read Only"(Apenas para leitura), onde não se remove nem adciona aulas
		 */
		return Collections.unmodifiableList(this.aulas);//Melhor encapsulamento, boa prática
	}

	public void adciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
		
		//ou
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);//Adcionando ao Map de acordo com Key,Value
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " 
				+ this.getTempoTotal() + ", Instrutor: " + this.instrutor
				+ ", Aulas " + this.getAulas() + "]";
	}

	public Aluno buscarMatriculado(int numeroMatricula) {
		if(!matriculaParaAluno.containsKey(numeroMatricula)) {
			throw new NoSuchElementException("O Aluno com este numero de matrícula: " + numeroMatricula + " não está Registrado");
		}
		return this.matriculaParaAluno.get(numeroMatricula);
	}
	
}
