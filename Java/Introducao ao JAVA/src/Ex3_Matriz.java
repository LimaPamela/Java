/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package src;

import java.util.Scanner;
public class Ex3_Matriz {

	public static void main(String[] args) {
		
		int [] [] numeros = new int[3][3];
		int soma10=0,lin,col,soma;
		
		Scanner leia = new Scanner(System.in);
		
		for (lin=0;lin<3;lin++) {
			for (col=0;col<3;col++) {
				System.out.println("Entre com um número:" );
				numeros[lin] [col] = leia.nextInt();
				if(numeros[lin] [col] > 10) {
				soma10 += numeros[lin] [col];
				
				}
			}
		}
		System.out.println("Números maiores que 10: "+soma10 );
}
