
package imput;

import java.util.Scanner;

/**
 Jerson Leandro Reyes Lozano
 */
public class Imput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("hola "+nombre);
    }
    
}
