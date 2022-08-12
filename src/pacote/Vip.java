package pacote;

public class Vip extends Ingresso{

    public Vip(String nome, String cpf, String event) {
        super(nome, cpf, event);
        //TODO Auto-generated constructor stub
    }

    public static int Desconto = 30;
    
    public void calcularValorIngresso(double valor) {
        double novoValor = valor + (valor * Desconto)/100;
        System.out.println("Valor do Ingresso: R$ " + novoValor);
    }
    
}
