
package Estructuradedatos;


import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        
        HashSet<String> name = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //Tamaño
        // no se usa los set de mannera odernada

        System.out.println(name.size());

        // Añadir elementos
        name.add("Esteban");
        name.add("robles");
        name.add("perez");
        name.add("perez robles");

        System.out.println(name.size());
        System.out.println(name);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        System.out.println("---------------");

        //Eliminat elementos
        name.remove("Esteban");
        System.out.println(name.size());
        System.out.println("---------------");

        //Buscar datos
        System.out.println(name.contains("Esteban"));
        System.out.println("---------------");

        System.out.println(name);
        name.add("robles");
        name.add("robles");
        name.add("robles");
        System.out.println();
        System.out.println("---------------");


        //name.addAll(numbers); error

        var countri = new HashSet<String>();
        countri.add("colombia");
        countri.add("mexico");
        countri.add("españa");

        name.addAll(countri);

        System.out.println(name);


        
    }
    
}
