package com.desafiobanco.conta;

import com.desafiobanco.cliente.Cliente;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Poupanca");
		super.ImprimirInformacoesComuns();
		
	}

	/*
	 * Metodo sobrescrevido da super classe para se adequar a sua particularidade No
	 * Caso para a conta poupança se o saldo for menos que o valor sacado, não realizará a operação
	 * Caracterizado como polimorfismo
	 */
	@Override
	public void sacar(double valor) {		
		if(saldo < valor) {
			System.out.println("Não há saldo suficiente");
		}else {
		saldo -= valor;
		}		
	}
	

	

	
}
