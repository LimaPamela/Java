import java.util.Scanner;
public class Ex3_While {

public static void main(String[] args) {

int media=0,quantNum=0;
float mediaNum=0,somaNum=0,numero=0;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Entre com sua Idade: ");
		numero = leia.nextFloat();
		
	while(numero >=0) {
		somaNum += numero;  
		quantNum++;
		System.out.println("Entre com sua Idade: ");
		numero = leia.nextFloat();
		}
		if(quantNum >= 99) {
		mediaNum = somaNum/quantNum;
		}
		else {
			System.out.println("Não é possível fazer dicisão  por zero !!!  ");
		}
	System.out.printf("\n Somatório dos números lidos: ", somaNum);
	System.out.printf("\n Quantidade dos números lidos: ", quantNum);
	System.out.printf("\n Média dos números lidos: ",mediaNum);
	
	
	}

}
