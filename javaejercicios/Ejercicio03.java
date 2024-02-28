package javaejercicios;

// @author Jerson Leandro Reyes Lozano//
import java.util.Scanner;

/*3. Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA, 
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un 
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente 
cualquiera por la compra de su aparato. El IVA es del 19%.*/
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del aparato sin IVA del aparato");
        double valorSinIva = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Escriba el nombre del aparato");
        
        String marca = scanner.nextLine();

        String nosyMarca = "Nosy" ;

        if (valorSinIva >= 500) {
            valorSinIva -= valorSinIva * 0.10;

        }
        if (marca.equals(nosyMarca)) {
            valorSinIva -= valorSinIva * 0.05; // descuentos adicional por se marca nosy 
        }
        double iva = valorSinIva * 0.19;

        double totalApagar = iva + valorSinIva ;
        
        System.out.println("El valor del aparato final es $" + totalApagar);
    }
}
