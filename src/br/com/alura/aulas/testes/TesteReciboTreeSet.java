package br.com.alura.aulas.testes;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.aulas.modelos.Recibo;

public class TesteReciboTreeSet {

	public static void main(String[] args) {
		
		Recibo r1 = new Recibo(123);
		Recibo r2 = new Recibo(22);
		Recibo r3 = new Recibo(43);
		
		//A TreeSet só funciona com classes que implementam a interface Comparable<>, porém é possivel usar
		//O objeto java.util.Comparator, para deficinir no Construtor o paramentro de comparação
		Set<Recibo> recibos = new TreeSet<>(Comparator.comparing(Recibo::getValor));
		recibos.add(r1);
		recibos.add(r2);
		recibos.add(r3);
		System.out.println(recibos);
	}

}
