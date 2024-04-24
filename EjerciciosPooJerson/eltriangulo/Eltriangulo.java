
package eltriangulo;

/**Nivel inicial
 *
 * @author  Jerson Leandro Reyes 
 */
public class Eltriangulo {

    public static void main(String[] args) {
     
        Triangulo t1 = new Triangulo(5, 5);
        Triangulo t2 = new Triangulo(10, 10);
        
        System.out.println("Triangulo 1 - Base: " + t1.getBase() + ", Altura: " + t1.getAltura() + ", Área: " + t1.calcularArea());
        System.out.println("Triangulo 2 - Base: " + t2.getBase() + ", Altura: " + t2.getAltura() + ", Área: " + t2.calcularArea());

        t1.setBase(10);
        t1.setAltura(2);

        
     System.out.println("Triangulo 1 (después de cambiar valores) - Base: " + t1.getBase() + ", Altura: " + t1.getAltura() + ", Área: " + t1.calcularArea());
    }
    
}
