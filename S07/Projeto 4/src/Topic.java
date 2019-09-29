import java.util.ArrayList;

public class Topic {
	ArrayList<Passageiro>cadeiras;
	int capacidadeMax;
	int cadeirasPreferenciais;
	
	public Topic (int capacidadeMax, int cadeirasPreferenciais) {
		this.capacidadeMax = capacidadeMax;
		this.cadeirasPreferenciais = cadeirasPreferenciais;
		
		cadeiras = new ArrayList <Passageiro>(); //Inicializando Array
		
		for (int i = 0; i < this.capacidadeMax; i++) { //Inicializando cadeiras  
			this.cadeiras.add(null);
		}
		
	}
	public void inserir (Passageiro pass) {
		if (pass.getIdade()>=60) {
			for(int i=0; i < this.cadeirasPreferenciais; i++){
				if(this.cadeiras.get(i)==null){
					this.cadeiras.set(i, pass);
					return;
					}
				}
		}else {
			if (!(pass.getIdade()>=60)) {
				for(int i=this.cadeirasPreferenciais; i<cadeiras.size(); i++) {
					if(this.cadeiras.get(i)==null){
						this.cadeiras.set(i, pass);
						return;
						}
					}
				}
			}
		}
	
	public boolean remover (String nome) {
		for (int i = 0; i < cadeiras.size(); i++) {
			if (cadeiras.get(i)!=null) {
				if (cadeiras.get(i).getId().equals(nome)) {
					cadeiras.set(i, null);
					return true;
				}
			}
		}
		return false;
	}

	
	public String toString () {
		String sair = "[";
		for (int i = 0; i < cadeiras.size(); i++) { //Números de cadeiras 
			if (i < this.cadeirasPreferenciais) {
				sair  += " @ ";
			}else {
				sair += " =  ";
			}
			if(this.cadeiras.get(i)!= null) {
                sair += this.cadeiras.get(i);    
			}
		}
		return sair += " ]";
	}
}
