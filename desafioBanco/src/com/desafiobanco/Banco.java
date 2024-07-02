package com.desafiobanco;

import java.util.ArrayList;

import com.desafiobanco.cliente.Cliente;
import com.desafiobanco.conta.Conta;

public class Banco {

	private String nome;
	private ArrayList<Conta> contas;
	private ArrayList<Cliente> clientes;

	
	//Metodo para imprimir cliente recebe uma lista de cliente(ArrayList)
	public void imprimirClientes(ArrayList<Cliente> clientes) {
		
		//No laço de repetição a cada cliente da lista é impresso nome e cpf
		for (Cliente c : clientes) {
			System.out.println("Cliente: " + c.getNome() + " CPF:" + c.getCpf());
			System.out.println("\n");
		}
	}

	//Busca de cliente por cpf, recebe a lista de cliente e o CPF a ser buscado
	public void buscarClientePorCpf(ArrayList<Cliente> clientes, String cpf) {

		//Cria uma nova instancia da classe cliente que recebera o retorno do metodo retornaClientePorCpf()
		Cliente cliente = retornaClientePorCpf(clientes, cpf);

		//caso nulo impime que não existe / caso contrário imprirá cpf e nome do cliente
		if (cliente == null) {
			System.out.println("Cliente não existe!\n");
		} else {
			System.out.println("O cliente encontrado com o cpf: " + cliente.getCpf() + " é " + cliente.getNome()
			+ "\n");
		}

	}

	//metodo para checar a existencia do cliente com o cpf informado no metodo buscarClientePorCpf
	public Cliente retornaClientePorCpf(ArrayList<Cliente> clientes, String cpf) {

		//para a lista recebida será realizado um laço de repetição na lista de clientes
		//caso encontre retorna o objeto cliente, caso contrário retorna nulo 
		for (Cliente c : clientes) {
			if (c.getCpf().equals(cpf)) {
				return c;
			}
		}
		return null;

	}

	//construtor da Classe banco
	public Banco(String nome, ArrayList<Conta> contas, ArrayList<Cliente> clientes) {
		super();
		this.nome = nome;
		this.contas = contas;
		this.clientes = clientes;
	}

	//getter and setters
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}

}
