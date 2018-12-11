package br.com.alura.aulas.testes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMapExercicio2 {

	public static void main(String[] args) {
		
		/*
		 * O Map possui 3 conjuntos por baixo dos panos:
		 * Sendo um para as Chaves(Key), outro para os Valores(Value),
		 * E o terceiro para as associações.
		 */
		Map<String , Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		System.out.println("---------- Retornando Chaves ----------");
		//keySet() retorna o conjunto com todas as chaves
		nomesParaIdade.keySet().forEach(nomes -> {
			System.out.println("Imprimindo Nomes: " + nomes);
		});
		
		System.out.println("---------- Retornando Valores ----------");
		//values() Retorna o conjunto com todos os valores
		nomesParaIdade.values().forEach(idade -> {
			System.out.println("Imprimindo Idade: " + idade);
		});
		
		System.out.println("---------- Retornando Associações ----------");
		//entrySet() Retorna o conjunto com todas as associoações de Key,Value
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
	}
}
