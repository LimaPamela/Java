/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
A seguir determine e imprima a média aritmética dos lançamentos, 
contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/


programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		inteiro dado[5], numDado, maiorPont=0, quant=0, x=0,somaP=0,media=0
		
		para(x=0;x<5;x++)
		{
			escreva("\n Qual Nº foi sorteado? ")
			leia(numDado)
			se(maiorPont <= numDado)
			{
				maiorPont = numDado
				quant++
			}

			somaP += numDado
			dado[x] += numDado
		}	
		media = somaP / 5
		escreva("\n Soma dos Valores: ",somaP)
		escreva("\n Média aritmética: ", media)
		escreva("\n Maior pontuação: ", maiorPont)
		escreva("\n Quantidade de vezes que a maior pontuação foi sorteada: ",quant)
		
		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 12, 10, 4}-{numDado, 12, 19, 7}-{maiorPont, 12, 28, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */