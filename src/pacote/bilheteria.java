package pacote;

import java.util.Date;

abstract public class bilheteria {

    /* ----~* Atributos *~---- */

    public String nome;
    public String cpf;
    public Date data;
    public String evento;
    protected double valor;
    public String cap;
    
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEvento() {
        return evento;
    }

    public double getValor() {
        return valor = 35;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public void setCap(int cpf) {
    }
    
    public void setEvento(String event) {
    }
    
}
