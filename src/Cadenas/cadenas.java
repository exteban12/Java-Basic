package Cadenas;

public class cadenas {

    public static void main(String[] args) {

        String name = "esteban";
        String apellido = "Robles";

        //concatenra (unir)
        System.out.println(name + " " + apellido);

        //longitud
        System.out.println(name.length());

        //obtener caracter
        System.out.println(name.charAt(1));

        //subcadena
        System.out.println(name.substring(3));
        System.out.println(name.substring(1, 3));
        System.out.println("--------------------------------------");

        //mayuscula y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("--------------------------------------");

        //comprobar si tiene algo
        System.out.println("hola , java".contains("fuera"));
        System.out.println("hola , java".toUpperCase().contains("AVA"));
        System.out.println("--------------------------------------");

        //comparacion cadenas de texto
        System.out.println(name.equals("esteban"));
        System.out.println(name.equals("Esteban"));
        System.out.println(name.equalsIgnoreCase("esteban"));
        System.out.println("--------------------------------------");

        // Trim limpiar las cadenas de texto
        System.out.println(" Esteban david robles ".trim());

        //replace remplazar caracteres 
        System.out.println(" Esteban david robles ".replace(" ", ""));
        System.out.println("----------------------------------------------------");
        // formateo
        /*
        %s = para cadenas de texto
        %d = para numero entero
        %f =  para numero decimales
         */
        int age = 21;
        System.out.println(String.format("%s tiene %d", name, age));

    }
}
