package pacote;
import  pacote.bilheteria;
import java.util.Date;

public class Camarote extends Ingresso{

    public Camarote(String nome, String cpf, String evento, int capacidade) {
        super(nome, cpf, evento, capacidade);
        this.nome = nome; 
        this.cpf = cpf;
        this.evento = evento;
        this.data = new Date();
        this.capacidade = 5;
        //TODO Auto-generated constructor stub
        this.acrescimo = 60;
    }

     @Override
    public void imprimirValor() {
        // TODO Auto-generated method stub
        System.out.println("Valor do Ingresso Camarote: R$ " + (valor + (valor * acrescimo)/100));
    }   
}
