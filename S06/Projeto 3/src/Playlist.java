import java.util.ArrayList;


public class Playlist {
	private String nome;
	private ArrayList<Musica>musicas;
	
	public Playlist(String nome) {
		super();
		this.nome = nome;
		this.musicas = new ArrayList<Musica>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Musica>getMusica() {
		return musicas;
	}
	public void setMusica(ArrayList<Musica>Musica) {
		this.musicas = Musica;
	}
	public String toString () {
		return  this.nome + ":" + this.getMusica();
	}
	public void addMusica(String nome, String genero, String cantor, String album) {
		this.musicas.add(new Musica(nome, genero, cantor, album));
	}
	public void rmMusica(int index) {
		this.musicas.remove(index);
	}
	public static void main(String[] args) {
		Playlist marly = new Playlist ("Rap");
		marly.addMusica("Sobre Nós", "Rap", "Delacruz", "Poesia Acustica");
		marly.addMusica("Deixe-me ir", "Rap", "1Kilo", "Ep1");
		marly.rmMusica(1);
		System.out.println(marly);
		Playlist marly2 = new Playlist ("pop");
		marly2.addMusica("love", "pop", "lady", "artpop");
		marly2.addMusica("lovezz", "pop", "lady", "artpop");
		marly2.rmMusica(1);
		System.out.println(marly2);
				
		}
	}
