package Model;

public class Conta_CC extends Conta {
	
	public Conta_CC(int id, String clienteId) {
		 super(id, clienteId);
	}

	@Override
	String tipo() {
		return "CC";
	}
}
