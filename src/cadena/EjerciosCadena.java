package cadena;

/**
 *
 * @author ESTEBAN
 */
public class EjerciosCadena {

    public static void main(String[] args) {

        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String cadena3 = "  Esteban Robles Perez  ";
        
        // 1. Concatena dos cadenas de texto.
        System.out.println(cadena1 + " " + cadena2);
        System.out.println("----------------------------------------------------");

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(cadena1.length());

        System.out.println(cadena2.length());

        System.out.println(cadena3.length());
        System.out.println("----------------------------------------------------");

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(cadena1.charAt(0));
        System.out.println(cadena1.charAt(3));
        System.out.println("----------------------------------------------------");

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(cadena1.toUpperCase());
        System.out.println(cadena2.toLowerCase());
        System.out.println("----------------------------------------------------");

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(cadena1.contains("ola"));
        System.out.println(cadena1.contains("Esteban"));
        System.out.println("----------------------------------------------------");

        
        // 6. Formatea un string con un entero.
        int age = 21;
        System.out.println(String.format("%s tiene %d ",cadena3,age));
        System.out.println("----------------------------------------------------");

       
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(cadena3.trim());
        System.out.println("----------------------------------------------------");
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(cadena3.replace(" ", "-"));
        System.out.println("----------------------------------------------------");
        // 9. Comprueba si dos strings son iguales.
        System.out.println(cadena1.equals(cadena2));
        System.out.println("----------------------------------------------------");
        // 10. Comprueba si dos strings tienen la misma longitud.
        
    }

}
