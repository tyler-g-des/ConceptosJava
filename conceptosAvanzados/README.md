LIST {ArrayList, LinkedList}

SET {hastSet,TreeSet= mantiene ordenamiento}

Map {HashMap, TreeMap}

*En el caso de los Tree TreeSet ,como son elemento que su orden viene por ordencacia
Necesitan implementar la interfaz "comparable"

*Comparable (recordemos que esta interfaz nos obligaba a implementar el método compareTo (Object o))

*¿qué ocurre si queremos ordenar las Personas digamos por su altura, o por su nombre en orden alfabético? Pues que el orden natural definido no nos sirve y debemos de recurrir a la interfaz Comparator para implementar el método compare 

*En los datos primitivos no se puede utilizar el método compareTo por que no son objetos se devuelve el numero.

*En el caso de los TreeSet no repite los valores por los cuales se esta comparando en el compareTo de la interfaz *Comparable*, para cambiar esto hay que utilizar el equals y hashcode implementandolo en la clase que se desea utilizar. 

*Aqui se ve la diferencia entre hashSet y TreeSet uno es un arbol que implementa comparator para determinar los repetidos y Hash utiliza equals y hash para poder comparar

*Los SET no tienen metodo get por eso no se puede recorrer con un for tradiccional.

*Los linkedList y las list permiten iterar de todas las formas.

METODOS DE LIST
SIZE
El primer parametro de las lista especifica la posicion del elemento en la lista
REMOVE

LINKED LIST
getFirst
getLast
peekLast = no devuelven exception si no null 
removeFirst
removeLast
pollFirst = elimina el elemento y  no devuelve la excepcion
popFirst = elimina pero si devuelve la excepcion


* Los mapas no son de la interfaz colection pero si almacenan datos
* Las llaves no pueden repertirse en los MAP

METODOS DE MAP
PUT = guardar datos
