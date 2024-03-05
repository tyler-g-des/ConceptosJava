package Collections.List;


import Collections.Modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        //Set<Alumno> sa = new HashSet<>();
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size= " + al.size());
        System.out.println("Esta vacia = " + al.isEmpty());

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));
        al.add(3, new Alumno("Andres", 3));

        System.out.println(al + ", size= " + al.size());

    }
}
