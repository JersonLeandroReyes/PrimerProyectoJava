
package poo;


abstract class Triangulo extends Forma {
    
    
    double base;
    double altura;

    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }
  
  
    @Override
   public double calcularArea() {
        return (base * altura) / 2;
        
    }
   
       
   }
    
    
    
    
    
    
    
    
    
    
    






