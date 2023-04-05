package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luisa");

        Iterator<String> iterador = nombres.iterator();
        nombres.iterator();

        while(iterador.hasNext()) {
            String nombre = iterador.next();
            System.out.println(nombre);
        }
        }
    }


