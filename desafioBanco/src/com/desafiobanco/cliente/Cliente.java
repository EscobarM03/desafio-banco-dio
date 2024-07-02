package com.desafiobanco.cliente;

public class Cliente {

	private String nome;	
	private String cpf;	

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;		
	}

	//getters and setters

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	
}
