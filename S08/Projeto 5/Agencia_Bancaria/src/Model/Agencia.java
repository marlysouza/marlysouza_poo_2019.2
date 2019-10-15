package Model;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	List<Conta> contas;
	List<Cliente> clientes;
	int nextId;
    
	public Agencia() {
    	this.contas = new ArrayList<Conta>();
		this.clientes = new ArrayList<Cliente>();
		this.nextId = 0;
    }
	
    public void addCliente(String id) {
        
    	Cliente cliente = new Cliente(id);
        Conta corrente = new Conta_CC(nextId, id);
        nextId++;
        Conta poupanca = new Conta_CP(nextId, id);
        nextId++;

        cliente.addConta(corrente);
        cliente.addConta(poupanca);
            
        this.contas.add(corrente);
        this.contas.add(poupanca);
        this.clientes.add(cliente);
    
    } 
    
    public void mostrar() {
    	for(Conta elem : contas)
    		System.out.println(elem + "; ");
    }
    
    public void atualizar() {
    	for(Conta ele : contas) {
    		if(ele.tipo() == "CC") {
    			ele.saldo -= 20;
    			continue;
    		}
    		if(ele.tipo() == "CP") {
    			ele.saldo = ele.saldo * 1.01;
    		}
    	}
    }
    
    public void depositar(int c1, double valor) {
		for (Conta c : contas){
			if(c1 == c.id){
				c.saldo = c.saldo + valor;
				return;
			}
		}
	}
    
    public boolean sacar(int c1, double valor) {
    	if(contas.get(c1).saldo >= valor) {
    		contas.get(c1).saldo = contas.get(c1).saldo - valor;
    		return true;
    	} else {
    		System.out.println("Saldo Insuficiente!");
    	return false;
    	}
	}
    
    public void transferir(int c1, int c2, double valor) {
    	int tamanho = clientes.size() + clientes.size();
    	if(tamanho  >= c1 && tamanho >= c2) {
    		this.sacar(c1, valor);
			this.depositar(c2, valor);
    	} else {
			System.out.println("fail: conta nao encontrada");
    	}
   }
}