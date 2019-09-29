import java.util.Scanner;

public class Controler {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Topic topic = new Topic (0, 0);
		
		System.out.println("TOPIC");
		
		while (true) {
			String line = scanner.nextLine();
			String[] vet = line.split(" ");
			
			if (vet[0].equals("sair")) {
				break;
				
			}else if (vet[0].equals("init")) {
				topic = new Topic (Integer.parseInt(vet[1]),
						Integer.parseInt(vet[2]));
				
			}else if (vet[0].equals("show")) {
				System.out.println(topic);
			
			}else if (vet[0].equals("inserir")) {
				topic.inserir (new Passageiro(vet[1],
						Integer.parseInt(vet[2])));
				
			}else if (vet[0].equals("remover")) {
				topic.remover(vet[1]);
				
			}else {
				System.out.println("Falha: Comando inválido!");
			}
			
		}
	}
}