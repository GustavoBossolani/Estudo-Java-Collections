package br.com.alura.aulas.testes;

import java.util.HashSet;
import java.util.Set;

public class TesteSetsImprimindoAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Gustavo Bossolani");
		alunos.add("Tata Fota");
		alunos.add("Mano do Fut");
		alunos.add("Mando Noura");
		alunos.add("Gustavo Bossolani");
		
		System.out.println(alunos.size());
		System.out.println(alunos);
		
		
		//forEach com Lambda
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	}

}
