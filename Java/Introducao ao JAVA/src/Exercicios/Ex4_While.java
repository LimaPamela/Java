/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
 *  e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 *  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/
import java.util.Scanner;
public class Ex4_While {

	public static void main(String[] args) {
		
		int idade, genero, fp, contppc=0,contmn=0, contha=0,contbc=0,contpn=40, contpc=18,p=1;
		Scanner leia = new Scanner(System.in);
		
		while(p<=5) {
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("Entre com a seu gênero: (1-Feminino \n 2- Masculino \n 3-Binário) ");
			genero = leia.nextInt();
			System.out.println("Entre com o seu fator psicológico atual: (1- Calmo \n 2-Nervoso \n 3-Agressivo) ");
			fp = leia.nextInt();

	}
		if(fp==1) {
			contpc++;
		}
		if(genero == 1 && fp == 2) {
			contmn++;
		}
		if(genero == 2 && fp == 3) {
			contha++;
		}
		if(genero == 3 && fp == 1) {
			contbc++;
		}if(fp == 2 && idade> 40) {
			contpn40++;
		}if(fp == 1 && idade<18) {
			contpc18++;
		}
		p++;
}
	System.out.println("\n Números de pessoas calmas: "+contpc);
	System.out.println("\n Números de mulheres nervosas: "+contmn);
	System.out.println("\n Números de homens agressivos: "+contha);
	System.out.println("\n Números de pessoas binárias calmas:  "+contbc);
	System.out.println("\n Números de pessoas nervosas com + de 40 anos: "+contpn40);
	System.out.println("\n Números de pessoas calmas com - de 18 anos: "+contpc18);
	
	
}	
	
