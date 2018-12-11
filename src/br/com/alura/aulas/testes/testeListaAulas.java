package br.com.alura.aulas.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.aulas.modelos.Aula;

public class testeListaAulas {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Aprendendo a usar Listas com Objetos", 20);
		Aula a2 = new Aula("Entendendo Hashcodes",10);
		Aula a3 = new Aula("Revisitando ArrayLists", 17);
		Aula a4 = new Aula("Básico de Orientação Objeto", 8);
		
		ArrayList<Aula> aulas = new ArrayList<>(); 
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		//aulas.sort(null);
		System.out.println(aulas);
		
		//Ordenando com Java 8 - Comparando cada aula com critério de tempo (proximas 2 linhas fazem a mesma coisa)
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));S
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
	}
	
}
