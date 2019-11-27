package model;

public class Cliente {
	String id;
	String nome;
	float saldo;

	public Cliente(String id, String nome) {
		this.id = id;
		this.nome = nome;
		this.saldo = 0;
	}

	public String toString() {
		return "" + this.id + ":" + this.nome + ":" + this.saldo;

	}

}
