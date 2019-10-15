package controller;

import java.util.Scanner;

import Model.Agencia;

public class Controller {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia();
       
        while (true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            
            if(ui[0].equals("end")) {
                break;
            
            }else if(ui[0].equals("addCli")){
                agencia.addCliente(ui[1]);
                
            }else if(ui[0].equals("show")){
                agencia.mostrar();
                
            }else if(ui[0].equals("update")){
                agencia.atualizar();
                
            }else if(ui[0].equals("deposito")) {
            	agencia.depositar(Integer.parseInt(ui[1]), Double.parseDouble(ui[2]));
            	
            }else if(ui[0].equals("saque")) {
            	agencia.sacar(Integer.parseInt(ui[1]), Double.parseDouble(ui[2]));
            	
            }else if(ui[0].equals("transferencia")) {
            	agencia.transferir(Integer.parseInt(ui[1]), (Integer.parseInt(ui[2])), Double.parseDouble(ui[3]));
            	
            } else {
            	System.out.println("Comando Invalido!!!");
            }
        }
	}
}
