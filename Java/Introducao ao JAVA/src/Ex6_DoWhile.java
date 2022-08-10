/* Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/
import java.util.Scanner;
public class Ex6_DoWhile {

	public static void main(String[] args) {
		
		float media;
		int num, somaMult3=0,contMult3=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
			if(num == 0) {
				System.out.println("Volte Sempre! ");
			}
			else
			{
				if(num % 3 == 0) {
					somaMult3 += num;
					contMult3 ++;
				}
			}
		}
		while(num!=0);
		if(contMult3 == 0) {
			System.out.println("Não é possível fazer divisão por zero !!! ");
		}
		else
		{
		media = somaMult3 / contMult3;
		System.out.println("Média dos números multiplos por 3: "+media);
		}
	}

}
