/*Crie um programa que leia um número do teclado 
 * até que encontre um número igual a zero. No final,
mostre a soma dos números digitados.(DO...WHILE)*/
 
import java.util.Scanner;
public class Ex5_DoWhile {

	public static void main(String[] args) {
		int x, valor, somaValor=0;
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("Entre com um valor: ");
			valor = leia.nextInt();
			somaValor += valor;
			
		}while(valor != 0);
	
	System.out.println("Somatório dos valores: "+somaValor);
	}
	

}


