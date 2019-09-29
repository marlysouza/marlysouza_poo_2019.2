
public class Passageiro {
	private String id;
	private int idade;
	
	public Passageiro(String id, int idade) {
		super();
		this.id = id;
		this.idade = idade;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString () {
		return this.id + ":" + this.idade;
	
	}
}
