/* Faça um programa que entre com três números e coloque em ordem crescente.

		 Menor	Meio   Maior
		 A		B		C
		 A		C		B
		 B		A		C
		 B		C		A
		 C		A		B
		 C		B		A
		 */

package Ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o A: ");
		a = ler.nextInt();
		System.out.println("Entre com o B: ");
		b = ler.nextInt();
		System.out.println("Entre com o C: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("\nOrdem crescente: "+a+" , "+b+" , "+c);
		}else if(a<=c && c<=b) {
			System.out.println("\nOrdem crescente: "+a+" , "+c+" , "+b);
		}else if(b<=a && a<=c) {
			System.out.println("\nOrdem crescente: "+b+" , "+a+" , "+c);
		}else if(b<=c && c<=a) {
			System.out.println("\nOrdem crescente: "+b+" , "+c+" , "+a);
		}else if(c<=a && a<=b) {
			System.out.println("\nOrdem crescente: "+c+" , "+a+" , "+b);
		}else {
			System.out.println("\nOrdem crescente: "+c+" , "+b+" , "+a);

	}

}
