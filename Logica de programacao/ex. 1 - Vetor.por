/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e 
o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

programa
{
	funcao inicio()
	{
		inteiro pont[5], maiorPont=0,x

		para(x=0;x<5;x++)
		{
			escreva("\n Informe a ", x+1, " ª pontuação: ")
			leia(pont[x])
		}
		maiorPont = pont[0]
	
		para(x=0;x<5;x++)
		{
			se (maiorPont < pont[x])
			{
				maiorPont = pont[x]
			}
		}
		escreva("\n Maior pontuação foi a: ",maiorPont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pont, 8, 10, 4}-{maiorPont, 8, 19, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */