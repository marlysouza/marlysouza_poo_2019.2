
public class Marcador {
	private String marca;
	private String cor;
	private int tinta;
	private int tintaMax;
	private double pontaAtual = 0.7;
	Ponta ponta;
	
	public Marcador(String marca, String cor, int tinta) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.tintaMax = 10;
		this.tinta = tinta;
		this.pontaAtual = 0.7;
	}
	public void pintar (int qtd) {
		if (this.tinta>0) {
			this.tinta -= qtd;
			System.out.println("Pintando");
		}else {
			System.out.println("Sem tinta! Recarregue.");
		}	
	}
	public void recarregar (int carga) {
			this.tinta += carga;
			if (this.tinta>this.tintaMax)
			this.tinta = this.tintaMax;		
	}
	public void trocarponta (Ponta ponta) {
		if (ponta.tamanhoPonta == this.pontaAtual) {
			this.pontaAtual = ponta.tamanhoPonta;
			System.out.println("Ponta compativel, trocada!");
		}else {
			System.out.println("Ponta incompativel, tente outra.");
		}
	}
	public void status () {
		System.out.println("Sua carga de tinta é: " +this.tinta + "%");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getTinta() {
		return tinta;
	}
	public void setTinta(int tinta) {
		this.tinta = tinta;
	}
	public int getTintaMax() {
		return tintaMax;
	}
	public void setTintaMax(int tintaMax) {
		this.tintaMax = tintaMax;
	}
	public String toString () {
		return "Seu marcador é da marca: " + this.marca + 
				", sua cor é : " + this.cor +
				" e sua carga de tinta é : " + this.tinta + "%";
	}
}