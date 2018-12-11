package br.com.alura.aulas.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.aulas.modelos.Aula;
import br.com.alura.aulas.modelos.Curso;

public class TesteCurso2 {

	public static void main(String[] args) {
		
		Curso javaBasico = new Curso("Java: Revisando Utilidades", "Gustavo Bossolani");
		
		javaBasico.adciona(new Aula("Estudando Palavras Chaves do Java", 15));
		javaBasico.adciona(new Aula("Masterizando Arrays e Listas", 10));
		javaBasico.adciona(new Aula("Aprendendo as Collections", 25));
		
		List<Aula> aulasImutaveis = javaBasico.getAulas();
		System.out.println(aulasImutaveis);
		
		//Fazendo uma cópia de uma lista Read Only e editando-a
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		
		Collections.sort(aulasMutaveis, Comparator.comparing(Aula::getTempo));
		System.out.println(aulasMutaveis);
		
		System.out.println("Tempo total do curso: " + javaBasico.getTempoTotal());
		
		System.out.println(javaBasico);
	}
	
}
