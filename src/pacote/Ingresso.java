package pacote;

public class Ingresso extends bilheteria {

    public Ingresso(String nome, int cpf, String event){
        super.setNome(nome);
        super.setCap(cpf);
        super.setEvento(event);
        super.getValor();
        
    }

    public Ingresso(String nome, String cpf, String event) {
    }

    public static int acrescimo = 0;
    public static int valor = 35;

    public void calcularValorIngresso() {
        double novoValor = valor + (valor * acrescimo)/100;
        System.out.println("Valor do Ingresso: R$ " + novoValor);
    }

    @Override
    public void mostrarResumo() {
        // TODO Auto-generated method stub
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Evento: " + this.getEvento());
        System.out.println("Data: " + this.getData());
        System.out.println("Valor: " + (valor + (valor * acrescimo)/100));
    }


}

// Para ingresso é preciso também um método mostrar resumo, onde 
// mostrará o nome e o CPF do dono do ingresso e os dados do 
// evento, como nome do evento e a data.