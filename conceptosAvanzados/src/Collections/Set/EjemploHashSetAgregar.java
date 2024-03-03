package Collections.Set;

import java.util.*;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println(hs);
        boolean value = hs.add("tres");
        System.out.println(value);

        System.out.println(hs);

        // Los set no se pueden ordenar pero si se puede convertir en optra estructura que permita ordenamiento

        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);

        System.out.println(lista);

    }
}
