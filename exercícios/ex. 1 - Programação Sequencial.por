/*Faça um sistema que leia a idade de uma pessoa expressa em
anos, meses e dias e mostre-a expressa apenas em dias. */

programa
{
	
	funcao inicio()
	{
		inteiro dia = 0, mes = 0, idade = 0
		
		escreva(" Qual dia você nasceu? (expressado em número) \n")
		leia(dia)
		escreva(" Qual mês você nasceu? (expressado em número) \n")
		leia(mes)
		escreva(" Qual a sua idade em anos? (expressado em número) \n")
		leia(idade)
		
		escreva("\n Você têm ", idade*365 + 30*mes + dia  ," dias desde que nasceu.")
		
	}
}
