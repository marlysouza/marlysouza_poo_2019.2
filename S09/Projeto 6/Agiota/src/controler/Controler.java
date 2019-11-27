package controler;
import java.util.Arrays;
import java.util.Scanner;

import model.Cliente;
import model.Sistema;

public class Controler {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Sistema sistema = new Sistema(0);

		while (true) {
			String line = scanner.nextLine();
			String vet[] = line.split(" ");

			if (vet[0].equals("end")) {
				break;
			} else if (vet[0].equals("init")) {
				sistema = new Sistema(Float.parseFloat(vet[1]));
			} else if (vet[0].equals("emprestar")) {
                sistema.emprestar(vet[1], Float.parseFloat(vet[2]));
            } else if (vet[0].equals("historico")) {
                sistema.historico();
            } else if (vet[0].equals("addCli")) {
				String nome="";
				for(int i=2;i<vet.length;i++) {
					nome += " " + vet[i];
				}
				sistema.addCli(new Cliente(vet[1],nome));
			} else if(vet[0].equals("resumo")) {
            	sistema.resumo();
            } else if(vet[0].equals("filtrar")) {
            	sistema.filtrar(vet[1]);
            }
		}
	}
}
