
//Jerson Leandro Reyes lozano//

package poo;

import java.util.Scanner;


        
public class Poo {

  
    public static void main(String[] args) {
       
     Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el lado del primer cuadrado:");
        double lado1 = scanner.nextDouble();
        Cuadrado cuadrado1 = new Cuadrado("Cuadrado1", 0, 0, "Rojo", lado1);

        System.out.println("Ingrese el segundo lado cuadrado:");
        double lado2 = scanner.nextDouble();
        Cuadrado cuadrado2 = new Cuadrado("Cuadrado2", 0, 0, "Azul", lado2);

        System.out.println("Ingrese la base del primer triangulo:");
        double base1 = scanner.nextDouble();
        System.out.println("Ingrese la altura del primer trianuglo :");
        double altura1 = scanner.nextDouble();
        Triangulo triangulo1;
        triangulo1 = new Triangulo ("triangulo", 0, 0, "Verde", base1, altura1) {};

        System.out.println("Ingrese la base del segundo triangulo:");
        double base2 = scanner.nextDouble();
        System.out.println("Ingrese la altura del segundo triangulo :");
        double altura2 = scanner.nextDouble();
        Triangulo triangulo2 = new Triangulo("Rectangulo2", 0, 0, "Amarillo", base2, altura2) {};

        Forma[] formas = {cuadrado1, cuadrado2, triangulo1, triangulo2};

        double sumaAreas = 0;
        double sumaAreasCuadrados = 0;
        int contadorCuadrados = 0;

        for (Forma forma : formas) {
            sumaAreas += forma.calcularArea();
            if (forma instanceof Cuadrado) {
                sumaAreasCuadrados += forma.calcularArea();
                contadorCuadrados++;
            }
        }

        System.out.println("Suma de las areas de todas las formas: " + sumaAreas);
        System.out.println("Media de las areas de los cuadrados: " + (sumaAreasCuadrados / contadorCuadrados));

        double sumaPerimetros = 0;
        for (Forma forma : formas) {
            if (forma instanceof IFormas iFormas) {
                sumaPerimetros += iFormas.calcularPerimetro();
            }
        }

        System.out.println("Suma de los perímetros de todas las formas: " + sumaPerimetros);
    }
}  
    
    

