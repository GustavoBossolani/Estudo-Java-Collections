package br.com.alura.aulas.testes;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySets {

	public static void main(String[] args) {
		
		Set<String> nomes = Collections.emptySet();
		nomes.add("Gustavo Bossolani");
		
		//Não é possivel adcionar um objeto a um Set que foi destinado a ser vazio
		//Neste caso a utilidade de um emptySet seria:
		//Por exemplo, imagina que você precisa representar um curso que foi cancelado pois não teve matriculas. 
		//Nesse caso faria todo sentido DEVOLVER um Collections.emptySet()
	}

}
