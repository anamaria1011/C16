package co.com.ps.c7;

import java.util.ArrayList;
import java.util.List;

public class Ciclos {

    public static void main(String[] args) {


        //para

        List<String> miLista= new ArrayList<>();

        miLista.add("Mauricio");
        miLista.add("Alan");
        miLista.add("David");
        miLista.add("Carlos");
        miLista.add("Juan");

        for (String nombre:miLista
        ) {
            System.out.println(nombre);
        }

        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(0));
        }

    }

}