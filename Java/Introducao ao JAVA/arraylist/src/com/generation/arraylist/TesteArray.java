package com.generation.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArray {

	public static void main(String[] args) {
		
		double x = 0.0;
		
		Double y = Double.valueOf(10);

		
		java.util.ArrayList<Double> notas = new ArrayList<Double>();
		
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(6.0);
		notas.add(7.0);
		
		System.out.println(notas.toString());
		System.out.println("\n A posição da nota 5 é: " + notas.indexOf(5d));
		notas.set(notas.indexOf(5d), 9d);
		System.out.println("\n Alterar a nota 5 para 9: " + notas);
		//notas.remove(notas.indexOf(4.0d));
		//System.out.println(notas.toString());
		System.out.println(notas.isEmpty());
		System.out.println(Collections.max(notas));
		System.out.println(Collections.min(notas));
	}

}
