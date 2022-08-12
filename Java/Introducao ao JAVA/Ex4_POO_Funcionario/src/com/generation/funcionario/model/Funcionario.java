package com.generation.funcionario.model;

public class Funcionario {
	
	private String nome;
	private int numero; 
	private String dataNasc;
	private String setor;
	
	public Funcionario(String nome, int numero, String dataNasc, String setor) {
		this.nome = nome;
		this.numero = numero;
		this.dataNasc = dataNasc;
		this.setor = setor;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
	public void visualizar() {
		System.out.println("**********************************");
		System.out.println("\n Dados do Funcionário \n");
		System.out.println("**********************************");
		System.out.println(" Nome do Funcionário:  "+this.nome);
		System.out.println(" Número da acesso:  "+this.numero);
		System.out.println(" Data de Nascimento:  "+this.dataNasc);
		System.out.println(" Setor do funcioário:  "+this.setor);
	}
	
	}


