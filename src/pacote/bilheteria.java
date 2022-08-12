package pacote;

import java.util.Date;

abstract public class bilheteria {

    /* ----~* Atributos *~---- */

    private String nome;
    private Date data;
    protected double valor;
    private String cap;
    
    /* ----~* Metodos *~---- */
    
    abstract public void calcularValorIngresso() ;
    abstract public void mostrarResumo() ;

    /* ----~* Set & Get *~---- */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorUni() {
        return valor;
    }

    public void setValorUni(double valor) {
        this.valor = valor;
        valor = 35.00;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cpf) {
        this.cap = cpf;
    }
    
    public void setEvento(String event) {
    }
    public void setCap(int cpf) {
    }
    
}
