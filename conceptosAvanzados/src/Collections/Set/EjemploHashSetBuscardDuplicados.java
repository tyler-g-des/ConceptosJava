package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscardDuplicados {
    public static void main(String[] args) {

        String[] peces = {"Corvina","Lenguado","Pejerrey","Robalo","Atun","Lenguado"};

        Set<String> unicos = new HashSet<>();

        for (String pez : peces) {
            if(!unicos.add(pez)){
                System.out.println("Este valor es duplicado: " + pez);
            }
        }

        System.out.println("Lista sin duplicados " + unicos);
    }
}
