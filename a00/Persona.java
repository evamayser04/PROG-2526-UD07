public class Persona {
   protected int edad;
   protected String nombre;
   protected double estatura;
   protected String nacionalidad;

    //constructor
    Persona (int edad, String nombre, double estatura String nacionalidad){
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarDatos() {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(estatura);
        System.out.println(nacionalidad);
    }
}