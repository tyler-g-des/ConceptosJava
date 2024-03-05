package Collections.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts= " + ts);

        Set<Integer> ts1 = new TreeSet<>();
        ts1.add(3);
        ts1.add(2);
        ts1.add(1);
        ts1.add(4);
        ts1.add(5);

        System.out.println("ts1= " + ts1);

        //Para definir el orden en los TreeSet hay que utilizar la Interfaces Comparator

        Set<String> ts2 = new TreeSet<>(Comparator.reverseOrder());
        ts2.add("uno");
        ts2.add("dos");
        ts2.add("tres");
        ts2.add("cuatro");
        ts2.add("cinco");

        System.out.println("ts2= " + ts2);

        Set<Integer> ts3 = new TreeSet<>((a,b) -> b.compareTo(a));
        ts3.add(3);
        ts3.add(2);
        ts3.add(1);
        ts3.add(4);
        ts3.add(5);

        System.out.println("ts3= " + ts3);

    }
}
