
public class Tradutor {
	String palavra;
	String traducao;
	
	public Tradutor(String palavra, String traducao) {
		super();
		this.palavra = palavra;
		this.traducao = traducao;
	}
	
	public String toString () {
		return " PALAVRA: " + palavra + " TRADUCAO: " + traducao;
		
	}
}
