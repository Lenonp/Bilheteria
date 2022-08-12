package pacote;

public class Ingresso extends bilheteria {

    public Ingresso(String nome, int cpf, String event){
        super.setNome(nome);
        super.setCap(cpf);
        super.setEvento(event);
        
    }

    public Ingresso(String nome, String cpf, String event) {
    }

    @Override
    public void calcularValorIngresso() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mostrarResumo() {
        // TODO Auto-generated method stub
        
    }
    
}