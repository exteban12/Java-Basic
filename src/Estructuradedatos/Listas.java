package Estructuradedatos;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {

        //Declarar y creacion
        ArrayList<String> name = new ArrayList<>();

        var numbers = new ArrayList<Integer>(); // numeros

        // Tamaño
        System.out.println(name.size());
        System.out.println("-------------------");

        //añadir elementos
        name.add("Esteban");
        name.add("robles");
        name.add("perez");
        System.out.println(name.size());
        System.out.println("---------------");

        // añadir elemento
        System.out.println(name.getFirst());
        System.out.println(name.get(1));
        System.out.println(name.getLast());
        System.out.println("------------------");
        // Modificar los elementos d el arrays

        name.set(2, "estebanroblesperez.com");
        System.out.println(name.getLast());
        System.out.println("-------------------");

        //elimina 
        name.remove(2);
        ///System.out.println(name.get(2));
        System.out.println(name.size());
        System.out.println("-------------------");

        // buscar elementos
        name.contains("Esteban");
        System.out.println(name.contains("Esteban"));

        // limpiar arraylist
        name.clear();

    }

}
