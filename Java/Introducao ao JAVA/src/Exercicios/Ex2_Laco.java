/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

import java.util.Scanner;
public class Ex2_Laco {

	public static void main(String[] args) {
		
		int numero, somaPar=0,quantImpar=0,x;
		
		Scanner leia = new Scanner(System.in);
		for(x=1;x<=10;x++) {
			
		System.out.println("Entre com um número: ");
		numero = leia.nextInt();
		somaPar += numero;
		quantImpar += numero;
	}	
	
		if(x % 2 == 0) {
			somaPar += x;
		}else {
			 
			quantImpar += x;
			}
		
		System.out.println("Somatório dos números Pares: "+somaPar);
		System.out.println("Somatório dos números Impares: "+quantImpar);
	}

}
