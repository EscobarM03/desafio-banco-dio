package com.desafiobanco.conta;

import com.desafiobanco.cliente.Cliente;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);		
	}

	//Metodo sobrescrevido da super classe para se adequar a sua particularidade
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta corrente");
		super.ImprimirInformacoesComuns();
	}
	
	/*
	 * Metodo sobrescrevido da super classe para se adequar a sua particularidade No
	 * Caso para a conta corrente além do saldo pode ser sacado até 500 a mais
	 * Caracterizado como polimorfismo
	 */
	@Override
	public void sacar(double valor) {		
		if(saldo + 500 <= valor) {
			System.out.println("Não há saldo suficiente");
		}else {
		saldo -= valor;
		}		
	}

	
		
}
