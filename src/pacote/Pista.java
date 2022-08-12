package pacote;

public class Pista extends Ingresso{



    public Pista(String nome, String cpf, String event) {
        super(nome, cpf, event);
        //TODO Auto-generated constructor stub
    }

    public static int Desconto = 0;

    public void calcularValorIngresso(double valor) {
        double novoValor = valor + (valor * Desconto)/100;
        System.out.println("Valor do Ingresso: R$ " + novoValor);
    }
    
}
