package br.com.alura.aulas.testes;

import br.com.alura.aulas.modelos.Aula;
import br.com.alura.aulas.modelos.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		
		Curso javaBasico = new Curso("Introdu��o ao Java", "Gustavo Bossolani");
		
		//Linha abaixo retorna uma exception pois n�o � possivel alterar a lista diretamente
		//javaBasico.getAulas().add(new Aula("Conhecendo as palavras chaves", 15));
		
		javaBasico.adciona(new Aula("Estudando Palavras Chaves do Java", 15));
		javaBasico.adciona(new Aula("Estudando Arrays e Listas", 20));
		System.out.println(javaBasico.getAulas());

	}

}
