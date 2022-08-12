import pacote.Pista;
import pacote.Vip;

public class App {
    public static void main(String[] args) throws Exception {
        App ai = new App();
        ai.comprarIngresso();
    }

    private void comprarIngresso() {
        String n = "Anderson";
        String c = "011.212.212-11";
        String e = "Festa Junina";
        Vip vip = new Vip(n, c, e);
        vip.calcularValorIngresso();
        vip.mostrarResumo();
    }

}
