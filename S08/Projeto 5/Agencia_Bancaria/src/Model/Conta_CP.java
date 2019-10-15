package Model;

public class Conta_CP extends Conta{

	public Conta_CP(int id, String clienteId) {
		 super(id, clienteId);
	}

	@Override
	String tipo() {
		return "CP";
	}
}
