import pacote.Camarote;
import pacote.Pista;
import pacote.Vip;

public class App {
    public static void main(String[] args) throws Exception {
        App ai = new App();
        ai.comprarIngresso();
    }

    /* ====~* Ingresso Pista *~==== */

    private void comprarIngresso() {
        String n = "Anderson Silva";
        String c = "121.212.323-44";
        String e = "Show - Roberto Carlos";
        int cap = 0;
        Pista p = new Pista(n, c, e, cap);
        p.mostrarResumo();
        p.calcularValorIngresso();

    }

    /* ====~* Ingresso Vip *~==== */

    /*
     * private void comprarIngresso() {
     * String n = "Maria Antonella";
     * String c = "434.545.656-77";
     * String e = "Show - Bruno e Marrone";
     * int cap = 0;
     * Vip v = new Vip(n, c, e, cap);
     * v.mostrarResumo();
     * v.calcularValorIngresso();
     * }
     * 
     */

    /* ====~* Ingresso Camarote *~==== */

    /*
     * private void comprarIngresso() {
     * String n = "José Aparecido";
     * String c = "767.878.989-00";
     * String e = "Evento beneficente Campanha Agasalho";
     * int cap = 0;
     * Camarote ca = new Camarote(n, c, e, cap);
     * ca.mostrarResumo();
     * ca.calcularValorIngresso();
     * }
     */

}
