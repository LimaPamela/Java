/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
No final do processamento imprimir o salário total e o salário excedente.*/


programa
{
	
	funcao inicio()
	{

		inteiro VH = 10, excedente = 20, situacao = 1
		real salario = 0.0, hora = 0.0, S = 0.0
		
		
		escreva("\n Quantas horas trabalhou na semana?  ") 
		leia(hora)	
		
	
		se (hora>=51 e hora<=54)
		{}
		escreva("\n Escolha uma opção entre 0 a 4 referente ao execente das horas extras (50 horas normais + hora extra): \n")

		escreva("\n Opção 0 = 0 hora extra")	
		escreva("\n Opção 1 = 1 hora extra")
		escreva("\n Opção 2 = 2 horas extras")
		escreva("\n Opção 3 = 3 horas extras")
		escreva("\n Opção 4 = 4 horas extras \n")
		

		leia (excedente)
		escolha(excedente)
	
	{		
			caso 0: 
			escreva("\n Será efetuado o valor de R$", hora*VH)
			pare
			caso 1: 
			escreva("\n Será efetuado o pagamento no valor de R$ ", hora*VH + 10)
			pare
			caso 2: 
			escreva("\n Será efetuado o pagamento no valor de R$ ", hora*VH + 20)
			pare
			caso 3: 
			escreva("\n Será efetuado o pagamento no valor de R$ ", hora*VH + 30)
			pare
			caso 4: 
			escreva("\n Será efetuado o pagamento no valor de R$ ", hora*VH + 40)
			pare
			
	
			caso contrario:
			escreva("\n Opção Inválida !!!")
	}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */