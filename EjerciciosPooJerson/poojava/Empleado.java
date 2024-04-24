
package poojava;



public class Empleado {
    
    // Atributos privados 
    private String nombre;
    private int telefono;

    // Constructor para inicializar los atributos
    public Empleado(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        // Incrementar el contador de empleados
        numeroEmpleados++;
    }

    // Getters para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    // Setters para modificar los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Atributo estático y privado para contar el número de empleados
    private static int numeroEmpleados = 0;

    // Método público para obtener el número de empleados
    public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }
}
   

   
    
    

