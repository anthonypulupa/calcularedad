
package ec.edu.espoch.practicadelavoratorionumero4;
import java.util.Scanner;
        
public class Practicadelavoratorionumero4 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingresa la edad");
        int edad = e.nextInt();

        if (edad >= 0 && edad < 120) {
            //categoriza la persona   
            if (edad >= 0 && edad <= 12) {
                System.out.println("Eres un niño.");
            } else if (edad >= 13 && edad <= 35) {
                System.out.println("Eres un joven.");
            } else {
                System.out.println("Eres adulto.");
            }
        } else {
            System.out.println("Error!");
        }
    }
    }
