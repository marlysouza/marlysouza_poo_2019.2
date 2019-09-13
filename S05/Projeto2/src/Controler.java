import java.util.Scanner;

public class Controler {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Marcador marcador1 = new Marcador ("","", 0);
		
		System.out.println("Você possui um marcador!");
		System.out.println("O que deseja?");
		System.out.println("init, status, recarregar, pintar, trocarponta");
		
		while (true) {
			String line = scanner.nextLine();
			String [] vet = line.split(" ");
			
			if (vet[0].equals("status")) {
				marcador1.status();
			
			}else if(vet[0].equals("init")){
				marcador1 = new Marcador (vet[1],vet[2],Integer.parseInt(vet[3]));
				System.out.println(marcador1);
			}
			else if (vet[0].equals("recarregar")) {
				marcador1.recarregar(Integer.parseInt(vet[1]));
			}
			else if (vet[0].equals("pintar")) {
				marcador1.pintar(Integer.parseInt(vet[1]));
			}
			else if (vet[0].equals("trocarponta")) {
				 marcador1.trocarponta(new Ponta(Double.parseDouble(vet[1])));
			}else {
				System.out.println("Comando inválido");
			}
		}
	}

}
