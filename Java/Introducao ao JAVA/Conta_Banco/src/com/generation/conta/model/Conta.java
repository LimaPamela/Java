package com.generation.conta.model;

public class Conta {

	private int numero;
	private String agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public Conta(int numero, String agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta() {}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(float valor) {
		if (this.getSaldo() < valor)
		System.out.println("\n Saldo insuficiente!!");
		
		this.setSaldo(this.getSaldo() - valor);
		
		/*if (valor <= saldo) {
			saldo -= valor;
			return true;
		}else {
			System.out.println("você tentou sacar R$ " +valor+ " , mas seu saldo é insuficiente! Seu saldo é R$ " +saldo);
		}
			
			return false;*/
	}
	
	public void visualizar() {
		
		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta INSS";
			break;
		}
		
		
		System.out.println("**********************************");
		System.out.println("\n Dados da Conta \n");
		System.out.println("**********************************");
		System.out.println("Número da Conta:  "+this.numero);
		System.out.println("Número da Agencia:  "+this.agencia);
		System.out.println("Tipo da Conta:  " + tipo);
		System.out.println("Nome do Titular:  "+this.titular);
		System.out.println("Saldo da conta:  "+this.saldo);
		
	}
}
