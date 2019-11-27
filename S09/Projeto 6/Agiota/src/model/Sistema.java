package model;

import java.util.Map;
import java.util.TreeMap;

public class Sistema {

	float saldo;
	Map<String, Cliente> clientes;
	Map<Integer, Transacao> transacoes;
	int nextId;

	public Sistema(float saldo) {
		this.saldo = saldo;
		this.clientes = new TreeMap<String, Cliente>();
		this.transacoes = new TreeMap<Integer, Transacao>();
		this.nextId = 0;

	}
	
	public void addCli (Cliente cliente) {
		if (!clientes.containsKey(cliente.id)) {
			clientes.put(cliente.id, cliente);
		} else {
			System.out.println("Cliente já cadastrado");
		}
	}
	
	public void addTransacao(float value, String clienteId) {
		this.transacoes.put(nextId, new Transacao(nextId, value, clienteId));
	}
	
	public void emprestar(String id, float saldo) {
		if(!clientes.containsKey(id)) {
			System.out.println("cliente não existe");
		} else if (saldo > 0) {
			if (this.saldo >= saldo) {
				this.addTransacao(-saldo, id);
				this.saldo -= saldo;
				this.clientes.get(id).saldo += saldo;
			} else {
				 System.out.println("valor insuficiente!");
			 }
		 } 
		
	}
	
	public void receber(String id, float saldo) {
		if (clientes.get(id).saldo < saldo) {
			System.out.println("fail: pagamento maior que divida");
		}
		this.addTransacao(saldo, id);
		clientes.get(id).saldo -= saldo;
		this.saldo = saldo;
	}
	
	public void resumo() {
		for (String key : clientes.keySet()) {
			System.out.println(clientes.get(key).id + " : " + clientes.get(key).nome + " : " + clientes.get(key).saldo);
		}
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void historico() {
		for (int id : this.transacoes.keySet()) {
			System.out.println("id " + this.transacoes.get(id));
		}
	}
	
	public void filtrar(String key) {
		if(!clientes.containsKey(key)) {
			System.out.println("Cliente Invalido!");
		} else {
			for (int id : this.transacoes.keySet()) {
				if (transacoes.get(id).clienteId.equals(key)) {
					System.out.print(this.transacoes.get(id) + "\n");
				}
			}
		}
		System.out.println("Saldo: " + clientes.get(key).saldo);
		
	}
	
}
