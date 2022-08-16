package com.generation.conta.model;

public class ContaCorrente extends Conta{

	private float limite;

	public ContaCorrente(int numero, String agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Limite de crédito: " + this.limite);
	}
}
