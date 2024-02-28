package javaejercicios;

import java.util.Scanner;

/**
 *
 * @author Jerson Leandro Reyes Lozano
 */
public class Ejercicio04 {

    /*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
 0 - 2 0%
 2.01 - 5 10%
 5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería*/
    public static void main(String[] args) {
        double kilosManzanas;
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba kilos de la manzan");
        kilosManzanas = in.nextDouble();

        if (kilosManzanas < 2 && kilosManzanas > 0) {
            System.out.println("El precio de su compra es: " + (kilosManzanas * 10000));
        } else if (kilosManzanas > 2 && kilosManzanas < 5) {
            System.out.println("El precio de su compra es: " + ((kilosManzanas * 10000) - (kilosManzanas * 10000 * 0.1)));
        } else if (kilosManzanas > 5 && kilosManzanas < 10) {
            System.out.println("El precio de su compra es: " + ((kilosManzanas * 10000) - (kilosManzanas * 10000 * 0.15)));
        } else {
            System.out.println("El precio de su compra es: " + ((kilosManzanas * 10000) - (kilosManzanas * 10000 * 0.2)));
        }
    }

}
