package Collections.List;



import Collections.Modelo.Alumno;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {

        //Set<enlazadaumno> sa = new HashSet<>();
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size= " + enlazada.size());
        System.out.println("Esta vacia = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size= " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus",5));
        enlazada.addLast(new Alumno("Zeus",6));

        System.out.println(enlazada + ", size= " + enlazada.size());

        System.out.println("Primero:  " + enlazada.getFirst() );
        System.out.println("Ultimo:  " + enlazada.getLast() );
        System.out.println("Segundo :  " + enlazada.get(2) );
    }
}
