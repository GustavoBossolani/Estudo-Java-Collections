package br.com.alura.aulas.testes;

import java.util.Set;

import br.com.alura.aulas.modelos.Aluno;
import br.com.alura.aulas.modelos.Aula;
import br.com.alura.aulas.modelos.Curso;

public class TesteCursoComAlunos {

	public static void main(String[] args) {
		
		
		Curso javaCollections = new Curso("Estudando Coleções", "Gustavo Bossolani");
		
		javaCollections.adciona(new Aula("Estudando Set's", 10));
		javaCollections.adciona(new Aula("Aprendendo o novo: HashSet's", 15));
		javaCollections.adciona(new Aula("Implementando Set's na prática", 20));
		
		javaCollections.matricular(new Aluno("João Garcia", 2112));
		javaCollections.matricular(new Aluno("Almeida dos Santos", 2495));
		javaCollections.matricular(new Aluno("Daniel Ramalho", 2665));
		
		//Iterando com Lambda
		javaCollections.getAlunos().forEach(aluno -> {
			System.out.println(aluno.getNome());
		});
		
		
	}
}
