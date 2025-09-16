package Estructuradedatos;

import java.util.HashMap;
import java.util.HashSet;

public class Maps {
    public static void main(String[] args) {


        HashMap<String,String> name = new HashMap<>();
        var numbers = new HashMap<Integer,String>();

        //tamaño
        System.out.println(name.size());
        System.out.println("-----------");

        //añadir elementos
        name.put("esteban","esteban@gmail.com");
        name.put("robles","robles@gmail.com");
        name.put("perez","perez@gmail.com");

        System.out.println(name);
        System.out.println("-----------");

        //acceder a los elementos
        System.out.println(name.get("esteban"));
        System.out.println(name.get("dev"));
        System.out.println("-----------");

        //Verificar si existe
        System.out.println(name.containsKey("esteban"));
        System.out.println(name.containsKey("dev"));
        System.out.println("-----------");

        System.out.println(name.containsValue("esteban@gmail.com"));
        System.out.println(name.containsValue("dev@gmail.com"));
        System.out.println("-----------");


        //eliminar elementos
        System.out.println(name.remove("esteban"));
        System.out.println(name.remove("robles"));
        System.out.println(name);

        //limpiar los map
        name.clear();
        System.out.println(name);

        




    }
}
