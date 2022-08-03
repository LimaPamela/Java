/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/

programa
{
	funcao inicio()
	{
		inteiro numeros[3][3], somaNumeros=0,linha,coluna,somaDiagonal=0
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\n Entre com um número: ")
				leia(numeros[linha][coluna])
				somaNumeros += numeros[linha][coluna]
				se(coluna == 1)
				{
					somaDiagonal += numeros[linha][coluna]
				}
			}
		}	
		escreva("\n Somatório dos NÚMEROS foi de: ",somaNumeros)
		escreva("\n Somatório da DIAGONAL(linha+coluna = (0,0) + (1,1) + (2,2)) foi de: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 688; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 8, 10, 7}-{somaNumeros, 8, 25, 11}-{somaDiagonal, 8, 52, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */