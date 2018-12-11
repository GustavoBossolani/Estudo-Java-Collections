package br.com.alura.aulas.testes;

import java.util.HashMap;
import java.util.Map;

public class TesteMapExercicio {

	public static void main(String[] args) {
		
		//No código abaixo, temos um Map preparado que associa uma pessoa com a sua idade.
		//Sabendo que temos acesso ao conjunto de chaves de um Map através do método keySet(),
		//implemente um código que itere por esse conjunto e imprima os seus valores.
		  Map<Integer, String> pessoas = new HashMap<>();
	        pessoas.put(21, "Leonardo Cordeiro");
	        pessoas.put(27, "Fabio Pimentel");
	        pessoas.put(19, "Silvio Mattos");
	        pessoas.put(23, "Romulo Henrique");
	        
	        //<----- Resposta ----->
	        
	        //Iterando para cada chave Idade e retornando o valor que é o nome da pessoa
	       pessoas.keySet().forEach(idade ->{
	    	   System.out.println(pessoas.get(idade));
	       });
	       
	}

}
