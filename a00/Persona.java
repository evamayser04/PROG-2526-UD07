package a00;

public class Persona {
   private int edad;
   private String nombre;
   private double estatura;
   private String nacionalidad;

    //constructor
    Persona (int edad, String nombre, double estatura String nacionalidad){
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarDatos() {
        System.out.println("\tNombre: " + getNombre());
        System.out.println("\tEdad: " + getEdad() + " años");
        System.out.println("\tEstatura: " + getEstatura() + " m");
        System.out.println("\tNacionalidad: " + getNacionalidad());
    }

    // Método público que trabaja con los atributos privados
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Getters y Setters protected: solo accesibles desde subclases

    // Getters
    protected int getEdad() {
        return edad;
    }
    protected String getNombre() {
        return nombre;
    }        
    protected double getEstatura() {
        return estatura;
    }
     protected String getNacionalidad() {
        return nacionalidad;
    }
    
    // Setters
    protected void setEdad(int edad) {
        this.edad = edad;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    protected void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    } 
}