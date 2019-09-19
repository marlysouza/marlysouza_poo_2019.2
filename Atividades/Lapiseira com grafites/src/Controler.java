
public class Controler {
	public static void main(String[] args) {
		Lapiseira pentel = new Lapiseira ("Pentel", 0.4);
		pentel.addGrafites(0.4);
		pentel.addGrafites(0.8);
		pentel.addGrafites(0.4);
		pentel.addGrafites(0.4);
		pentel.addGrafites(0.4);
		pentel.rmGrafites(0);
		pentel.rmGrafites(2);
		System.out.println(pentel);
		
	}

}
