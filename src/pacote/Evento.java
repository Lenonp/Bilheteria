package pacote;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public abstract class Evento extends bilheteria {
        
        List<User> users = new ArrayList<>();

        int i = 0;
        while (i < 30) {
            User actual = new User("Evento " + i, "data " + i, "valor " + i, "capacidade " + i);
            users.add(actual);
            
        }

    System.out.println(user.get(0).getFirstName());
    System.out.println(user.get(0).getLastName());

    User user = new User("Show - Roberto Carlos" + i, "data " + i, "valor " + i, "capacidade " + i);

    @Override
    public void calcularValorIngresso() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void imprimirValor() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mostrarResumo() {
        // TODO Auto-generated method stub
        
    }
    user.add(user);

    /* ----~* Metodos *~---- */
    
}
    