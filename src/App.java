import java.util.Scanner;
import pacote.Ingresso;
import pacote.Pista;
import pacote.Vip;
import pacote.Camarote;

public class App {

    Ingresso vetIn [] = new Ingresso [30];
    static int tam=0;

    public static void main(String[] args) throws Exception {
        
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        App ai = new App();

        while(opcao !=3) {
            System.out.println("Digite a Opção Desejada");
            System.out.println("1 - Comprar Ingresso");
            System.out.println("2 - Resumo Vendas");
            System.out.println("3 - Sair");

            opcao = scan.nextInt();
            scan.nextLine();

            switch(opcao) {
                
                case 1: ai.comprarIngresso();
                    break;

                case 2: ai.impreimirResumo();
                    break;

                case 3:System.out.println("Saindo..");
                    break;

                default:System.out.println("Opção Invalida");
            }
        }
    }
    
    private void comprarIngresso() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Tipo de Ingresso");
        System.out.println("1 - Ingresso Pista");
        System.out.println("2 - Ingresso Vip");
        System.out.println("3 - Ingresso Camarote");

        int i = scan.nextInt();
        scan.nextLine();

        if (i==1 || i==2 || i==3){
            System.out.println("Digite Seu Nome: ");
            String n = scan.nextLine();
            System.out.println("Digite o CPF: ");
            String c = scan.nextLine();
            System.out.println("Digite o Evento: ");
            String e = scan.nextLine();

            if (i==1)
                vetIn[tam]= new Pista(n,c,e);
            else if (i==2)
                vetIn[tam] = new Vip(n,c,e);
            else if (i==3)
                vetIn[tam] = new Camarote(n,c,e);

            tam++;
        }
    }

    private void impreimirResumo() {
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<tam; i++) {
            System.out.println("Nome do Evento: " + i);
            vetIn[i].calcularValorIngresso();
        }
        
    }
}
