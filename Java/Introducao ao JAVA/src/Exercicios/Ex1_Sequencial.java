/*Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;
public class Ex1_Sequencial {
	
		public static void main(String[] args) {
		int diasAno = 365,diasMes = 30, dias, meses, anos;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("Informe a sua idade: ");
				anos = leia.nextInt();
				
				System.out.print("Meses: ");
				meses = leia.nextInt();
				
				System.out.print("Dias: ");
				dias = leia.nextInt();
				
				dias += (anos * diasAno) + (meses * diasMes);
				
				System.out.println("\n\nA sua idade em dias é " + dias);
			}
		}
