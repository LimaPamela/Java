package com.generation.conta;

import com.generation.conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, "123", "CC" , "Pamela Santos" , 2000.0f);
		c1.visualizar();
		//System.out.println("Saldo da Conta C1: R$ " + c1.getSaldo());
		c1.setSaldo(3000.0f);
		System.out.println("\n Saldo Atualizado da Conta C1: R$ " + c1.getSaldo());
		
		
		Conta c2 = new Conta(123457, "123", "CC" , "Pamela Lima" , 3000.0f);
		c2.visualizar();
		//System.out.println("Saldo da Conta C2: R$ " + c2.getSaldo());
		c2.setTitular("Pamela Silva");
		System.out.println("Titular da C2 alterado: " + c2.getTitular());
		
		c2.sacar(1000.0f);
		c2.visualizar();
		
		if (c2.sacar(4000.0f)==true)
			c2.visualizar();
		//else
			//System.out.println("Saldo insuficinte!!");
		
		
		Conta c3 = new Conta();
		c3.setNumero(123458);
		c3.setTitular("Eva Lima");
		c3.setSaldo(1000.0f);
		c3.visualizar();
		
		
		
	}
		
}
