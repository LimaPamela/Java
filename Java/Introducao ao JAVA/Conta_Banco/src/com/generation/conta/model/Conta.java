package com.generation.conta.model;

public class Conta {

	private int numero;
	private String agencia;
	private String tipo;
	private String titular;
	private float saldo;
	
	public Conta(int numero, String agencia, String tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}
	
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
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
	
	public boolean sacar(float valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}else {
			System.out.println("você tentou sacar R$ " +valor+ " , mas seu saldo é insuficiente! Seu saldo é R$ " +saldo);
		}
			
			return false;
	}
	
	public void visualizar() {
		
		System.out.println("**********************************");
		System.out.println("\n Dados da Conta \n");
		System.out.println("**********************************");
		System.out.println("Número da Conta:  "+this.numero);
		System.out.println("Número da Agencia:  "+this.agencia);
		System.out.println("Tipo da Conta:  "+this.tipo);
		System.out.println("Nome do Titular:  "+this.titular);
		System.out.println("Saldo da conta:  "+this.saldo);
		
	}
}
