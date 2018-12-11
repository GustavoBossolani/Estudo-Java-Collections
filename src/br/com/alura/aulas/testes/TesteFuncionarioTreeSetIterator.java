package br.com.alura.aulas.testes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.aulas.modelos.Funcionario;

public class TesteFuncionarioTreeSetIterator {

	public static void main(String[] args) {
	
		Set<Funcionario> funcionarios = new TreeSet<>();
		funcionarios.add(new Funcionario("Jair", 63));
		funcionarios.add(new Funcionario("Gustavo", 21));
		funcionarios.add(new Funcionario("Leticia", 19));
		funcionarios.add(new Funcionario("Jamelão", 12));
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}

	}

}
