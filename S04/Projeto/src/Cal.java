import java.util.Scanner;

class Calculadora {
	int bateria = 1;
	boolean ligada;
	
	void status () {
		System.out.println("Bateria: " + bateria);
	}
	void recarregar (int carga) {
		bateria += carga;
		System.out.println("Bateria recarregada: " + bateria);
		
	}
	void soma (int a, int b) {
		if (bateria>0) {
			bateria -= 1;
			System.out.println(a+b);
		}else {
			System.out.println("Bateria insuficiente. Deseja recarregar?");
		}
	}
	void multi (int a, int b) {
		if (bateria>0) {
			bateria -= 1;
			System.out.println(a*b);
		}else {
			System.out.println("Bateria insuficiente. Deseja recarregar?");
		}
	}
	void divi (int a, int b) {
		if (bateria>0 && b!=0) {
			bateria -= 1;
			System.out.println(a/b);
		}else if (b==0) {
			bateria -= 1;
			System.out.println("falha: divisão por zero");
		}else {
			System.out.println("Bateria insuficiente. Deseja recarregar?");
		}
	}
	void sub (int a, int b) {
		if (bateria>0) {
			bateria -= 1;
			System.out.println(a-b);
		}else {
			System.out.println("Bateria insuficiente. Deseja recarregar?");
		}
	}
}

public class Cal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Calculadora calc = new Calculadora ();
		
		System.out.println("CALCAULADORA INICIADA: O QUE DESEJA FAZER?");
		System.out.println("status, recarregar, somar, multi, divi, sub");
		
		while (true) {
			String line = scanner.nextLine();
			String [] vet = line.split(" ");
			
			if (vet[0].equals("status")) {
				calc.status();
			}
			else if (vet[0].equals("recarregar")) {
				calc.recarregar(Integer.parseInt(vet[1]));
			}
			else if (vet[0].equals("somar")) {
				calc.soma(Integer.parseInt(vet[1]),Integer.parseInt(vet[2]));
			}
			else if (vet[0].equals("multi")) {
				calc.multi(Integer.parseInt(vet[1]),Integer.parseInt(vet[2]));
			}
			else if (vet[0].equals("divi")) {
				calc.divi(Integer.parseInt(vet[1]),Integer.parseInt(vet[2]));
			}
			else if (vet[0].equals("sub")) {
				calc.sub(Integer.parseInt(vet[1]),Integer.parseInt(vet[2]));
			}
			else {
				System.out.println("comando inválido");
			}
		}
	}
}



