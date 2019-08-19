package calculador;

class Calc{
	int carga;
	boolean ligada;
	
	void ligar () {
		if (carga == 0) {
			System.out.println("Não há carga");
			return;
		}
		if (ligada) {
			System.out.println("Calculadora ligada");
			return;
		}
		ligada = true;
		System.out.println("Ligando a calculadoraa");
	}
	void desligar () {
		if (carga == 0) {
			System.out.println("Desligada");
			return;
		}
		if (!ligada) {
			System.out.println("já está desligada");
			return;
		}
		ligada = false;
		System.out.println("Desligando a calcludora");
	}
	void somar (int a, int b) {
		if (this.carga>0) {
			System.out.println(a+b);
		}else {
			System.out.println("Sem carga");
		}
				
	}
	void multiplicar (int a, int b) {
		if (this.carga>0) {
			System.out.println(a*b);
		}else {
			System.out.println("Sem carga");
		}
	}
	void divisao (int a, int b) {
		if (this.carga>0 && b!=0) {
			System.out.println(a/b);
		}else if (b==0){
			System.out.println("Falha na divisão por zero");
		}else {
			System.out.println("Sem carga");
		}
	}
	
}
public class Calculador {
	public static void main(String[] args) {
		Calc calc1 = new Calc();
		calc1.ligada = true;
		calc1.carga = 2;
		calc1.ligar();
		calc1.somar(2, 2);
		calc1.multiplicar(2, 2);
		calc1.divisao(8, 2);
		calc1.desligar();
	}

}
