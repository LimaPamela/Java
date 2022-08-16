package com.generation.conta.repository;

import com.generation.conta.model.Conta;

public interface ContaRepository {
	
	void inserir (Conta conta);
	int procurar (int numero);
	void visualizar(int posicao);
	void sacar (int posicao, float valor);
	
	
	
}
