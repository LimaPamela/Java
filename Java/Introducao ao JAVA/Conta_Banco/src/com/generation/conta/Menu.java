package com.generation.conta;

import java.util.Scanner;
import com.generation.conta.model.Banco;
import com.generation.conta.model.Conta;
import com.generation.conta.model.ContaCorrente;
import com.generation.conta.model.ContaInss;
import java.io.IOException;
import com.generation.conta.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		int opcao, numero, tipo, numeroDeposito, beneficio = 0;
		String titular, agencia = "";
		float saldo, limite, valor = 0.0f;
		
		while(true) {

				System.out.println(Cores.TEXT_GREEN + "***********************************************" 
													+ Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND 
													+ "   ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND
													+ "         ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND 
													+ "      ");
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_GREEN
													+ "************************************************");
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLUE_BACKGROUND
														 + "                                                                     ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            1 - Criar Conta                                          ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            2 - Ver Saldo da Conta                                   ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            3 - Dados da Conta                                       ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            4 - Sacar                                                ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            5 - Depositar em Conta Corrente                          ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            6 - Transferir entre Contas Corrente                     ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            7 - Sair                                                 ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "                                                                     " 
													+ Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_GREEN + "*************************************************");
				System.out.println(Cores.TEXT_YELLOW + " Entre com a opção desejada:                         "
													+ Cores.TEXT_RESET);
				opcao = leia.nextInt();
				
				if (opcao == 7) {
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Generation Brasil - O seu Futuro começa aqui!");
					leia.close();
					System.exit(0);
				}
				
				switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta Corrente\n\n");
					
					System.out.println("Digite o Numero da Agência: ");
					agencia = leia.next();
					System.out.println("Digite o Nome do Titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					do {
						System.out.println("Digite o Tipo da Conta (1-CC ou 2-CI): ");
						tipo = leia.nextInt();
					}while(tipo < 1 && tipo > 2);
						
					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = leia.nextFloat();
					
					if (tipo == 1) {
						System.out.println("Digite o Limite de Crédito (R$): ");
						limite = leia.nextFloat();
						
						// Criar Conta Corrente
						
					}else {
						System.out.println("Digite o Numero do Benefício: ");
						beneficio = leia.nextInt();
						
						// Criar Conta INSS
						
					}
										
					keyPress();
					
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Visualizar Saldo\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
							
					// Ver Saldo
					
					keyPress();
					
					break;
				case 3:
					
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
					
					// Ver dados da Conta
					
					keyPress();
	
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
					System.out.println("Digite o Valor do Saque (R$): ");
					valor = leia.nextFloat();
					
					// Sacar
					
					keyPress();

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
					System.out.println("Digite o Valor do Depósito (R$): ");
					valor = leia.nextFloat();
					
					// Depositar - apenas Conta Corrente
					
					keyPress();
					
					break;
				case 6:
					
					System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
					
					System.out.println("Digite o Numero da Conta de Origem: ");
					numero = leia.nextInt();
					System.out.println("Digite o Numero da Conta de Destino: ");
					numeroDeposito = leia.nextInt();
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
					
					// Transferir - apenas Conta Corrente
					
					keyPress();
					
					break;
				default:
					
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!");
					keyPress();
					
					break;
			}
		}		
		
	}
	
	public static void keyPress() {
		
		try {
			
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
			
		} catch (IOException e) {
			
			System.out.println("Você pressionou uma tecla diferente de enter!");
			
		}finally {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		
		}
	}
}