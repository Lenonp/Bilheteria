package pacote;
import  pacote.bilheteria;
import  java.util.Date;

public class Pista extends Ingresso{

    public Pista(String nome, String cpf, String evento, int capacidade) {
        super(nome, cpf, evento, capacidade);
        this.nome = nome; 
        this.cpf = cpf;
        this.evento = evento;
        this.data = new Date();
        this.capacidade = 60;
        //TODO Auto-generated constructor stub
        this.acrescimo = 0;
    }

    @Override
    public void imprimirValor() {
        // TODO Auto-generated method stub
        System.out.println("Valor do Ingresso Pista: R$ " + (valor + (valor * acrescimo)/100));
    }    
}
