package com.desafiobanco;

import java.util.ArrayList;
import java.util.Arrays;

import com.desafiobanco.cliente.Cliente;
import com.desafiobanco.conta.Conta;
import com.desafiobanco.conta.ContaCorrente;
import com.desafiobanco.conta.ContaPoupanca;

public class Main {
 
	public static void main(String[] args) {
		
		//Criação de instancias de objetos da Classe Cliente
		Cliente carlos = new Cliente("Carlos", "11111111111");
		Cliente marcos = new Cliente("marcos", "22222222222");
		Cliente paula = new Cliente("Paula", "33333333333");
		Cliente maria = new Cliente("Maria", "44444444444");
		
		//Criação de instancias de objetos da Classe Conta
	    Conta ccCarlos = new ContaCorrente(carlos);
		Conta ccMarcos= new ContaCorrente(marcos);
		Conta ccMaria = new ContaCorrente(maria);
		Conta cpPaula = new ContaPoupanca(paula);
		
		//Adicionando contas a uma lista de contas
        ArrayList<Conta> contas = new ArrayList<>(Arrays.asList(ccCarlos, ccMarcos, ccMaria, cpPaula));
        
        //acionando cliente a uma lista de clientes
        ArrayList<Cliente> clientesContas = new ArrayList<>(Arrays.asList(ccCarlos.getCliente(), 
        		ccMaria.getCliente(), ccMarcos.getCliente(), cpPaula.getCliente()));
        
		/*
		 * //Não foi considerado possíveis clientes com duas contas
		 */
        
        //Criação de instância da Classe banco. Adicionando as listas de contas e clientes
        Banco banco = new Banco("Banco Desafio",contas,clientesContas);       
        
        //chamada de metodo da classe Banco para impressão da lista de clientes
        banco.imprimirClientes(clientesContas);
        
        //chamada de metodo da classe Banco para busca de cliente por cpf       
        banco.buscarClientePorCpf(clientesContas, "11111111111");
        banco.buscarClientePorCpf(clientesContas, "88888888888");
        
        
        //chamadas de metodos depositas, transferir, sacar e imprimirExtrato
        ccCarlos.depositar(300);
        ccMarcos.depositar(100);
        ccMaria.depositar(500);		
        cpPaula.depositar(1000);
        cpPaula.sacar(1500);
		ccCarlos.transferir(300, ccMarcos);
		ccMarcos.sacar(50);
		ccMaria.sacar(250);
		ccCarlos.sacar(1000);		
		ccCarlos.imprimirExtrato();
		ccMarcos.imprimirExtrato();
		ccMaria.imprimirExtrato();
		cpPaula.imprimirExtrato();
		
		
		
	}

}
