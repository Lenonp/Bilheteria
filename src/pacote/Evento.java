package pacote;
import pacote.bilheteria;

public abstract class Evento extends bilheteria {
    Evento vetEv[] = new Evento[30];
    
    abstract public void quantidadeIngressoVendido();
    
    
    
    
    public Evento() {
    }


    /* ----~* Metodos *~---- */
    
    public void venderIngresso(){
        for (int i = 0; i <= 30; i++) {
   
        }

    }


    @Override
    public void calcularValorIngresso() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mostrarResumo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void imprimirValor() {
        // TODO Auto-generated method stub
        
    }


}
