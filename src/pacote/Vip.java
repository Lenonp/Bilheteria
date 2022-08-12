package pacote;

import java.util.Date;

public class Vip extends Ingresso{

    public Vip(String nome, String cpf, String evento) {
        super(nome, cpf, evento);
        this.nome = nome; 
        this.cpf = cpf;
        this.evento = evento;
        this.data = new Date();
        //TODO Auto-generated constructor stub
        this.acrescimo = 30;
    }   
}
