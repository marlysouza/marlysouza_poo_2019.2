import java.util.HashMap;

public class Controler {

	public static void main(String[] args) {
		HashMap<String, Tradutor>palavra = new HashMap<String,Tradutor>();
		
		palavra.put("1", new Tradutor ("Casa", "House"));
		palavra.put("2", new Tradutor ("Gato", "Cat"));
		palavra.put("3", new Tradutor ("Cachorro", "Dog"));
		palavra.put("4", new Tradutor ("Cavalo", "Horse"));
		
		System.out.println(palavra);
		palavra.remove("4");
		System.out.println(palavra);
		System.out.println(palavra.entrySet());

	}

}
