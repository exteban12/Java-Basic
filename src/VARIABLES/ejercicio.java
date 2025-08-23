
package VARIABLES;


public class ejercicio {
    public static void main(String[] args) {
        
        
        
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Esteban";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int number = 20;

        // 3. Crea una variable double con tu altura en metros.
        double numberTwo = 2.3;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean TrueFalse = true;

        // 5. Declara una constante con tu email.
        final String email = "esteban@gmail.com";
        
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char letter = 'a';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String locate = "calle 11";
        System.out.println(locate);
        locate = "calle 20";
        System.out.println(locate);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        String lastName="robles";
        System.out.println(lastName.getClass().getSimpleName());
        
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
       String color;
       color = "red";
        System.out.println(color);
        
    }
    
    
}
