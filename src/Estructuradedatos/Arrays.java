
package Estructuradedatos;

/**
 *
 * @author ESTEBAN
 */
public class Arrays {
    public static void main(String[] args) {
        
        
        //declaracion
        int[] numbers = {1,2,3,4,};
        System.out.println(numbers[1]);
        
        String[] names = {"esteban","robles","dona"};
        System.out.println(names);
        System.out.println("---------------------------");
        // Acceso
        System.out.println(names[0]);
        System.out.println(numbers[0]);
        
        //Modificacion
        numbers[0]= 1;
        numbers[1]= 2;
        System.out.println(numbers[1]);
        
        System.out.println(names[2]);
        names[2] = "mama";
        System.out.println(names[2]);
        
        System.out.println(names.length);
        names[2]= null;
        System.out.println(names[2]);
        System.out.println(names.length);
        
    }
    
}
