package javaejercicios;

//@author Jerson Leandro Reyes//
import java.util.Scanner;

public class Ejercicio02 {

    /*  2. En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste 
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se 
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas 
que compra y la que tiene que pagar por el total de la compra.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa la cantidad de llantas");
        int numeroDeLlantas = scanner.nextInt();

        int precioPorLlanta;
        if (numeroDeLlantas < 5) {
            precioPorLlanta = 100;
        } else if (numeroDeLlantas <= 10) {
            precioPorLlanta = 75;
        } else {
            precioPorLlanta = 50;
        }
        int totalFinal = numeroDeLlantas * precioPorLlanta;

        System.out.println("Precio por cada llanta: $" + precioPorLlanta);

        System.out.println("Total que debe pagar por las llantas" + totalFinal);
}
    }
    
        
    