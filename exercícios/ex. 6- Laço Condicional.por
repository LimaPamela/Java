/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

programa
{
	
	funcao inicio()
	{

	inteiro situacao = 1

	escreva("\n Para classificar o nadador de acordo com a idade dele, vamos seguir os passos a seguir: \n")
	
	escreva("\n Opção 1 = Infantil A (5 a 7 anos)")
	escreva("\n Opção 2 = Infantil B (8 a 11 anos)")
	escreva("\n Opção 3 = Juvenil A (12 a 13 anos)")
	escreva("\n Opção 4 = Juvenil B (14 a 17 anos)")
	escreva("\n Opção 5 = Adultos (Maiores de 18 anos) \n")

	escreva("\n Escolha uma opção entre 1 a 5: \n")
	leia(situacao)
	escolha (situacao)
	{
			caso 1: 
			escreva("\n O nadador está na categoria do Infantil A.")
			pare
			caso 2: 
			escreva("\n O nadador está na categoria do Infantil B.")
			pare
			caso 3: 
			escreva("\n O nadador está na categoria do Juvenil A.")
			pare
			caso 4: 
			escreva("\n O nadador está na categoria do Juvenil B.")
			pare
			caso 5: 
			escreva("\n O nadador está na categoria de Adultos.")
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
 * @POSICAO-CURSOR = 228; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */