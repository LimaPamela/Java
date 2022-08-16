package com.generation.conta.model;

import java.util.ArrayList;

import com.generation.conta.repository.ContaRepository;

public class Banco implements ContaRepository {

	private ArrayList<Conta> listConta = new ArrayList<Conta>();
	
	public Banco() {
		this.listConta = new ArrayList<Conta>();
	}

	@Override
	public void inserir(Conta conta) {
		listConta.add(conta);
		System.out.println("\n Conta numero: " + conta.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public int procurar(int numero) {
		
		for(int contador=0; contador < listConta.size(); contador++) {
			if((listConta.get(contador)).getNumero() == numero)
				return contador;
		}
		return -1;
	}

	@Override
	public void visualizar(int posicao) {
		
		if (posicao != -1)
			listConta.get(posicao).visualizar();
		else
			System.out.println("\n Conta não encontrada!");
		
	}

	@Override
	public void sacar(int posicao, float valor) {
		if (posicao != -1)
			listConta.get(posicao).sacar(valor);
		else
			System.out.println("\n Conta não encontrada!");
		
	}

	public int gerarNumero() {
		return listConta.size() + 1;
	}
	
	public void verSaldo(int posicao) {
		if(posicao !=-1)
			System.out.println("\nO saldo da conta numero: " + 
					listConta.get(posicao).getNumero() + 
					" é R$ " + listConta.get(posicao).getSaldo());
		else
			System.out.println("\n Conta não encontrada!");
	}
	
	public void depositar(int posicao, float valor) {
		if (posicao != -1) {
			if (listConta.get(posicao).getTipo() == 1) {
				listConta.get(posicao).depositar(valor);
				System.out.println("\n Depósito efetuado com sucesso!");
			}else
				System.out.println("\n Operação Inválida!");
		}else
			System.out.println("\n Conta não encontrada!");
	}
	
	public void transferir(int posicaoOrigem, int posicaoDestino, float valor) {
		if (posicaoOrigem != -1 && posicaoDestino != -1) {
			if(listConta.get(posicaoOrigem).getTipo() == 1 &&
				listConta.get(posicaoDestino).getTipo() == 1) {
				listConta.get(posicaoOrigem).sacar(valor);
				listConta.get(posicaoDestino).depositar(valor);
				System.out.println("\n Transferência efetuada com Sucesso!");
			}else
				System.out.println("\nOperação Inválida!");
		}else {
			System.out.println("\n Contas não encontradas!");
		}
	}

}
