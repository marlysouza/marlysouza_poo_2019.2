package Model;

import java.util.ArrayList;

class Cliente{
    String id;
    ArrayList<Conta> contas;

    public Cliente(String id){
        this.id = id;
        contas = new ArrayList<Conta>();
    }
    void addConta(Conta conta){
        contas.add(conta);
    }

    public String toString(){
        return id;
    }

}
