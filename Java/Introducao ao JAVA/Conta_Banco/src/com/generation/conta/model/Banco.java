package com.generation.conta.model;

import java.util.ArrayList;

import com.generation.conta.repository.ContaRepository;

public class Banco implements ContaRepository {

	private ArrayList<Conta> listConta = new ArrayList<Conta>();
	
	@Override
	public void inserir(Conta conta) {
		this.listConta = new ArrayList<Conta>();
		
	}

	@Override
	public int procurar(int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void visualizar(int posicao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int posicao, float valor) {
		// TODO Auto-generated method stub
		
	}
}

/*public class Banco {

	private Conta conta;

	public Banco(Conta conta) {
		super();
		this.conta = conta;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
}*/
