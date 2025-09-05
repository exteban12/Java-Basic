/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condiciones;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicios {

    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int age = 11;
        if (age >= 18) {
            System.out.println("puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
        System.out.println("___________________________________________-");
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 10;
        int num2 = 10;

        if (num1 > num2) {
            System.out.println(String.format("Si %d es mayor que %d", num1, num2));
        } else {
            System.out.println(String.format("%d es igual a %d", num1, num2));
        }
        System.out.println("___________________________________________-");

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int num3 = 0;

        if (num3 > 0) {
            System.out.println(String.format("%d es positivo", num3));
        } else if (num3 < 0) {
            System.out.println(String.format("%d es Negativo ", num3));
        } else {
            System.out.println(String.format("%d es cero", num3));
        }
        System.out.println("___________________________________________-");

        // 4. Crea un programa que diga si un número es par o impar.
        int num4 = 4;

        if (num4 % 2 == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }
        System.out.println("___________________________________________-");
        // 5. Verifica si un número está en el rango de 1 a 100.
        int num5 = -1;
        if (num5 >= 1 && num5 <= 100) {
            System.out.println("el numero esta en el rango");
        } else {
            System.out.println("el numero no esta en el rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                throw new AssertionError();
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        float nota = 919;
        
        if (nota < 0 || nota > 100  ) {
            System.out.println("No estas en las notas");
        }else if (nota >= 80 ) {
            System.out.println("Sobresaliente");
        }else if (nota >= 60) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspendido");
        }
       
        
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad = 14;
        if (edad >= 15) {
            System.out.println("Puedes entar");
        }else{
            System.out.println("Necesitas compania");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char vocal ='y';
        
        if (vocal == 'a'|| vocal == 'e'|| vocal == 'i'|| vocal == 'o'|| vocal == 'u' ) {
            System.out.println(String.format("%s es una vocal ",vocal));
        }else{            
            System.out.println(String.format("[%s] es una consonante ",vocal));

        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 10;
        int b = 10;
        int c = 30;
        
        if (a > b && a > c ) {
            System.out.println(String.format("%d es mayo que %d y %d",a,b,c));
            
        }else if (b > a && b > c) {
            System.out.println(String.format("%d es mayor que %d y %d",b,a,c));
        }else{
            System.out.println(String.format("%d es mayor que %d y %d",c,a,b));
        }
        
        
        
        
        
        
        
        
        
        
    }

}
