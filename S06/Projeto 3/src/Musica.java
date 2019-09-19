

public class Musica {
	private String nome;
	private String genero;
	private String cantor;
	private String album;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Musica(String nome, String genero, String cantor, String album) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.cantor = cantor;
		this.album = album;
	}
	
	public String toString () {
		return  "[" + this.nome + ","+ this.genero + "," + this.cantor + "," + this.album + "]";
	
		
	}
}
	
