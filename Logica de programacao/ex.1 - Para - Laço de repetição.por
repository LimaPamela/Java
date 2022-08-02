/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber: 
  
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00. 


4 				100%
quantP			per100

4* per100 = quantP* 100 
per100 = (quantP * 100) /4


*/


programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real  salario,mediaSal,somaSal=0.0,maiorSal=0.0,medianf=0.0, per100=0.0,nf=0.0
		inteiro x,quantP=0,somaNF=0

		para(x=1;x<=4;x++)
		{
		escreva("\n Qual é o seu salário?")
		leia(salario)
		escreva("\n Quantos filhos você tem?")
		leia(nf)
		somaSal += salario
		somaNF += nf
		se(maiorSal <= salario)
		{
			maiorSal = salario
		}
		
		se(salario<=100)
		{
			quantP ++
		}
	
	}
		mediaSal = somaSal /4
		medianf =	somaNF /4
		per100 = (quantP * 100) /4
			
	
	escreva("\n Média de SALÁRIO da população é de: ",mat.arredondar(mediaSal,2)," reais")
	escreva("\n Média de FILHOS da população é de: ",mat.arredondar(medianf,2))
	escreva("\n Maior salário: ", maiorSal, " reais")
	escreva("\n Percentual das pessoas com salário até R$ 100,00:  ",mat.arredondar(per100,2)," %")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */