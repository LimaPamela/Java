package com.generation.conta.model;

public class ContaCorrente extends Conta {

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

	@Override
	public void sacar(float valor) {

		if(this.getSaldo() + this.getLimite() < valor)
			System.out.println("\n Saldo Insuficiente!");
		
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void depositar(float valor) {

		if (valor > 0)
			this.setSaldo(this.getSaldo() + valor);

	}
	
	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);

	}
	
}
	
