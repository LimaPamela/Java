/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/

package Ex;
import java.util.Scanner;
public class Ex4 {	
public static void main(String[] args) {
		
		int numero;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com um número qualquer: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			resultado = Math.sqrt(numero);
		}else {
			resultado = Math.pow(numero, 2);
		}
		//System.out.println("RESULTADO =  "+resultado);
		System.out.printf("RESULTADO =  %.2f",resultado);
			
	}

}
