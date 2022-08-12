package com.generation.cliente.model;

public class Paciente {
	
	private String titular;
	private int numero; //carteirinha do convênio
	private String dataNasc;
	private String endereço;
	
	public Paciente(String titular, int numero, String dataNasc, String endereço) {
		this.titular = titular;
		this.numero = numero;
		this.dataNasc = dataNasc;
		this.endereço = endereço;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
		
	public void visualizar() {
		System.out.println("**********************************");
		System.out.println("\n Dados do Paciente \n");
		System.out.println("**********************************");
		System.out.println(" Nome do Titular:  "+this.titular);
		System.out.println(" Número da carteirinha do convênio:  "+this.numero);
		System.out.println(" Data de Nascimento:  "+this.dataNasc);
		System.out.println(" Endereço do paciente:  "+this.endereço);
	}
	}
	
