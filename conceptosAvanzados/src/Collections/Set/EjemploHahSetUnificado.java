package Collections.Set;


import Collections.Set.Modelo.Alumno;

import java.util.*;

public class EjemploHahSetUnificado {
    public static void main(String[] args) {

        //Set<Alumno> sa = new HashSet<>();
        List<Alumno> sa = new ArrayList<>();

        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 3));

        System.out.println(sa);


        System.out.println("Utilizando un for clasico");
        for (int i = 0; i<sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }

        System.out.println("Usando un foreach");
        for (Alumno a: sa) {
            System.out.println(a.getNombre());
        }

        System.out.println("Usando un iterator mas while");
        Iterator<Alumno> it = sa.iterator();

        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("foreach mas lambda por defecto, Stream");
        sa.forEach(a -> System.out.println(a.getNombre()));

        System.out.println("ultra resumida");
        sa.forEach(System.out::println);
    }
}
