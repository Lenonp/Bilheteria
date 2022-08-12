package pacote;

public class Camarote extends Ingresso{

    public Camarote(String nome, String cpf, String event) {
        super(nome, cpf, event);
        //TODO Auto-generated constructor stub
    }

    public static int Desconto = 60;
    
    public void calcularValorIngresso(double valor) {
        double novoValor = valor + (valor * Desconto)/100;
        System.out.println("Valor do Ingresso: R$ " + novoValor);
    }
    
}
