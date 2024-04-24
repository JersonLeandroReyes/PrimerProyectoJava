
package ejerciciospoo;


public class EjerciciosPoo {

  
    public static void main(String[] args) {
       
        Alumno alu1 = new Alumno (5,"Jerson","reyes");
        
        System.out.println("La id de alu1 es "+ alu1.getId()); 
      
        System.out.println("el nombre del alu1 es "+ alu1.getNombre());
        
        
        alu1.setId(9);
    }
    
}
