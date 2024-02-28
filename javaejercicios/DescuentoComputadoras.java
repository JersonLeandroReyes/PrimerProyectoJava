package javaejercicios;

import java.util.Scanner;

/*
 * @author Jerson Leandro Reyes Lozano
 */

public class DescuentoComputadoras {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        // Leer el número de computadoras compradas
        System.out.println("Ingrese el número de computadoras compradas: ");
        int cantidadComputadoras = scanner.nextInt();

        // Precio de cada computadora
        int precioPorComputadora = 500;

        // Calcular precio total antes del descuento
        int precioTotal = cantidadComputadoras * precioPorComputadora;

        // Determinar el descuento según la cantidad de computadoras compradas
        double descuento;
        if (cantidadComputadoras < 5) {
            descuento = precioTotal * 0.10; // 10% de descuento
        } else if (cantidadComputadoras < 10) {
            descuento = precioTotal * 0.20; // 20% de descuento
        } else {
            descuento = precioTotal * 0.40; // 40% de descuento
        }

        // Calcular precio total después del descuento
        double precioTotalConDescuento = precioTotal - descuento;
       //Casteo a entero
       
       int totalFinal =(int)precioTotalConDescuento;
      
        // Mostramos los resultados
        System.out.println("El precio total antes del descuento es: $" + precioTotal);
        System.out.println("El descuento aplicado es: $" + descuento);
        System.out.println("Total de la compra:$" + totalFinal);

 
    }
}

    
