package com.desafiobanco.conta;

import com.desafiobanco.cliente.Cliente;

public abstract  class Conta implements Iconta{
	
	private static int AGENCIA_PADRAO =1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;	
		this.cliente = cliente;
	}
	

	@Override
	public void depositar(double valor) {
		saldo += valor;		
	}

	@Override
	public void transferir(double valor, Iconta contaDestino) {
		this.sacar(valor);
		this.depositar(valor);		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//Metodode impressão de dados das contas a ser utilizado apenas as classes filhas
	protected void ImprimirInformacoesComuns() {
		System.out.println(String.format("agencia: %s", this.cliente.getNome()));
		System.out.println(String.format("agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f%n", this.saldo));
	}

	
	
}
