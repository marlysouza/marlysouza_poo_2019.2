import java.util.ArrayList;

public class Lapiseira {
	private String marca;
	private double ponta;
	private ArrayList<Grafites>grafites;
	
	public Lapiseira(String marca, double ponta) {
		super();
		this.marca = marca;
		this.ponta = ponta;
		this.grafites = new ArrayList<Grafites>();
	}
	
	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public ArrayList<Grafites>getGrafites() {
		return grafites;
	}

	public void setGrafites(ArrayList<Grafites>grafites) {
		this.grafites = grafites;
	}
	
	public String toString () {
		return this.marca + ":" + this.getGrafites();
	}
	
	public void addGrafites(double ponta) {
		if (this.ponta == ponta) {
			this.grafites.add(new Grafites (ponta));
			System.out.println("Grafite compativel :) ");
		}else {
			System.out.println("Grafite incompátivel :( ");
		}
		
	}
	
	public void rmGrafites (int index) {
		this.grafites.remove(index);
		System.out.println("Removido :( ");
	
	}
	
}