
public class Grafites {
	private double ponta;

	public Grafites(double ponta) {
		super();
		this.ponta = ponta;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public String toString () {
		return "[" + this.ponta + "]";
	}			

}
