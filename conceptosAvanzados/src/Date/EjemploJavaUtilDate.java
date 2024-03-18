package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("Esta es la fecha actual: " +  fecha);

        //Modificar formato de fecha
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MM, yyyy");

        String sdf = df.format(fecha);
        System.out.println( sdf );
    }
}
