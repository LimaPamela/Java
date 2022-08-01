
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
	dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.*/

programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
	
	real x = 0.0, y = 0.0, z = 0.0, carro = 0.0
	

	escreva("\nQual é o valor do carro?  reais\n")
	leia(x)
	escreva("\nQual é a porcentagem do imposto?  %\n")
	leia(y)
	escreva("\nQual é a porcentagem do distibuidor?  %\n")
	leia(z)

	
	escreva("\n O valor final do carro com os impostos é de: ", x + (x*y/100) + (x*z/100)," reais")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 742; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */