package _pasted_code_;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		float [] [] matriz1 = new float[2][2];
		float [] [] matriz2 = new float[2][2];
		float [] [] matriz3 = new float[2][2];
		int lin,col,numero,op;
		
		Scanner leia = new Scanner(System.in);
		
		for(lin=0;lin<2;lin++) {
			for(col=0;col<2;col++) {
				System.out.println("Entre com o valor da Matriz1: ");
				matriz1[lin][col] = leia.nextFloat();
				System.out.println("Entre com o valor da Matriz2: ");
				matriz2[lin][col] = leia.nextFloat();
				
			}
		}
		
		do {
			
			System.out.println("Menu de Matrizes");
			System.out.println("1- Somar as duas matrizes");
			System.out.println("2- Subtrair a primeira matriz da segunda");
			System.out.println("3- Adicionar uma constante as duas matrizes");
			System.out.println("4- Imprimir as matrizes");
			System.out.println("0- Sair do programa"); 
			System.out.println("Digite a sua opção");
			op = leia.nextInt();
			
			switch(op) {
				
			case 1:
				
				
				
				
				for(lin=0;lin<2;lin++) {
					for(col=0;col<2;col++) {
						matriz3[lin][col] = matriz1[lin] [col] + matriz2[lin][col];
					}
				}
			
			
		
			
			
			
			
			}
		}
		
	}

}
