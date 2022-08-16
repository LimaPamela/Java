package com.generation.divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		int divisor, dividendo = 0;
		boolean loop = true;
		
		Scanner leia = new Scanner(System.in);
		
	do {
		try{
		System.out.println("\n Digite o valor do dividendo: ");
		dividendo = leia.nextInt();
		
		System.out.println("\n Digite o valor do divisor: ");
		divisor = leia.nextInt();
		
		dividir(dividendo, divisor);
		
		loop = false;
			
		}catch(ArithmeticException e) {
			System.err.println("Exceção: " + e);
			leia.nextLine();
			System.out.println("\n Digite valores inteiros diferentes do que zero! ");
		}
		catch(InputMismatchException e) {
			System.err.println("Exceção: " + e);
			leia.nextLine();
			System.out.println("\n Digite valores inteiros ! ");
		}finally // erro que não dá para resolver
		{
			System.out.println("\n Programa encerrado! ");
		}
	}

	while(loop);
			
	}
	
	public static void dividir(int dividendo, int divisor) throws ArithmeticException {
		System.out.println("\n Divisão  = " + (dividendo / divisor));
	}
}
