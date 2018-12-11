package br.com.alura.aulas.testes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TesteIterator {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		//O Iterator é um jeito mais antigo de iterar em coleções e listas
		Iterator<String> iterador = letras.iterator();
		while(iterador.hasNext()) {
			String proximaLetra = iterador.next();
			System.out.println(proximaLetra);
		}
	}
}
