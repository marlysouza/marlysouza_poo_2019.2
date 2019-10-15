package Model;

public abstract class Conta {
    int id;
    public double saldo;
    String clienteId;
   
    abstract String tipo();
    
    public Conta(int id, String clienteId) {
        this.id = id;
        this.clienteId = clienteId;
        this.saldo = 0;
    }
    
    public String toString() {
        return "" + id + ":" + clienteId + ":" + saldo + ":" + this.tipo();
    }
}
