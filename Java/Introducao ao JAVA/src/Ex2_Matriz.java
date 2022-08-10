/* Faça um programa que receba 6 números inteiros e mostre: 
Os números pares digitados;  
A soma dos números pares digitados; 
Os números ímpares digitados; 
A quantidade de números ímpares digitados.*/

package src;

import java.util.Scanner;

public class Ex2_Vetor {

public static void main(String[] args) {
		
		int [] [] numeros = new int[3][2];
		int somaPar=0,numImpar=0,quantImpar=0,quantPar=0,lin,col;
		
		
		Scanner leia = new Scanner(System.in);
		
		for (lin=0;lin<3;lin++) {
			for (col=0;col<2;col++) {
				System.out.println("Entre com um número:" );
				numeros[lin] [col] = leia.nextInt();
				if(numeros[lin] [col] % 2 == 1) {
					numImpar += numeros[lin] [col];
					quantImpar++;
				}else {
					somaPar += numeros[lin] [col];
					quantPar++;
				}
			}
		}
		System.out.println(" A soma dos números pares digitados: "+somaPar);
		System.out.println("Os quantidade de números pares digitados: "+quantPar);
		System.out.println("Os soma dos números ímpares digitados: "+numImpar);
		System.out.println("A quantidade de números ímpares digitados: "+quantImpar);
	
}
}