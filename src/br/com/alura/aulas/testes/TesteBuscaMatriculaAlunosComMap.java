package br.com.alura.aulas.testes;

import br.com.alura.aulas.modelos.Aluno;
import br.com.alura.aulas.modelos.Aula;
import br.com.alura.aulas.modelos.Curso;

public class TesteBuscaMatriculaAlunosComMap {

	public static void main(String[] args) {
		
		Curso unity = new Curso("Iniciando na Unity Engine", "Gustavo Bossolani");
		unity.adciona(new Aula("Luz, Camera e A��o!", 50));
		unity.adciona(new Aula("Vamos transformar?", 30));
		unity.adciona(new Aula("PO em Jogos?", 60));
		
		unity.matricular(new Aluno("Jo�o Alfredo", 2188));
		unity.matricular(new Aluno("Lek de Konoha", 1313));
		unity.matricular(new Aluno("Fernand�o", 1598));
		
		System.out.println("O aluno com o numero de Matr�cula: 1313 est� Matriculado?");
		Aluno aluno = unity.buscarMatriculado(2188);
		System.out.println(aluno);
	}

}
