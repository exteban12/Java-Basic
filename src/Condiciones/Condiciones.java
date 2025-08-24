package Condiciones;

/**
 *
 * @author ESTEBAN
 */
public class Condiciones {

    public static void main(String[] args) {

        int age = 17;

        if (age > 18) {
            System.out.println("Eres mayor de edad: " + age);
        } else if (age == 18) {
            System.out.println("Acabas de cumpir 18 anos");
        } else {
            System.out.println("Eres menor de edad");
        }

    }

}
