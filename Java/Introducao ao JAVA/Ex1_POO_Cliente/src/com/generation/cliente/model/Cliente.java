package com.generation.cliente.model;

public class Cliente {
	
	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	private String email;
	private int telefone;
	
	public Cliente(int id, String cpf, String nome, String endereco, String email, int telefone) {
		
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar() {
		System.out.println("ID: " + this.id);
		System.out.println("CPF:  " + this.cpf);
		System.out.println("Nome:  " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
		
		
		
	}
		
}
