
package poojava;

import java.util.Scanner;

//Jerson leandro Reyes Lozano//

public class PooJava {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
    
// Crear array de 4 empleados
        Empleado[] empleados = new Empleado[4];

        // Leer datos de cada 
        for (int i = 0; i < empleados.length; i++) {
            int numeroEmpleado = i + 1;
            System.out.print("Ingrese el nombre del empleado " + numeroEmpleado + ": ");
            String nombre = sc.nextLine();

            // Validar que el teléfono sea un número entero
            int telefono;
            do {
                System.out.print("Ingrese el teléfono del empleado " + numeroEmpleado + ": ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: El teléfono debe ser un número entero. Ingrese de nuevo:");
                    sc.next();
                }
                telefono = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea
            } while (telefono <= 0); // Validar que el teléfono sea mayor que cero

            // Crear un nuevo objeto Empleado y agregarlo al array
            empleados[i] = new Empleado(nombre, telefono);
        }

        // Mostrar los datos de cada empleado
        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Teléfono: " + empleado.getTelefono());
           
            
        }

        // Mostrar el número de empleados
        System.out.println("\nNúmero de empleados total: " + Empleado.getNumeroEmpleados());
    }
}

     

        
        
    
    

