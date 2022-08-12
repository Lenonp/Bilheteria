import pacote.Camarote;
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
        Camarote cam = new Camarote(n, c, e);
        cam.calcularValorIngresso();
        cam.mostrarResumo();
    }

}
