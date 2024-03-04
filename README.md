LIST

SET {hastSet,TreeSet= mantiene ordenamiento}

En el caso de los Tree TreeSet ,como son elemento que su orden viene por ordencacia
Necesitan implementar la interfaz "comparable"

Comparable (recordemos que esta interfaz nos obligaba a implementar el método compareTo (Object o))

¿qué ocurre si queremos ordenar las Personas digamos por su altura, o por su nombre en orden alfabético? Pues que el orden natural definido no nos sirve y debemos de recurrir a la interfaz Comparator para implementar el método compare 

En los datos primitivos no se puede utilizar el método compareTo por que no son objetos se devuelve el numero
