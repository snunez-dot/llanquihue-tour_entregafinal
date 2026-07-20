package cl.llanquihuetour.model;

/**
 * Clase abstracta que representa a una persona del sistema.
 */
public abstract class Persona implements Registro {

    private String nombre;
    private Rut rut;
    private Direccion direccion;

    // Constructor sin parámetros.
    public Persona() {

    }

    // Constructor con parámetros.
    public Persona(String nombre, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    // Getter.
    public String getNombre() {
        return nombre;
    }

    // Setter.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter.
    public Rut getRut() {
        return rut;
    }

    // Setter.
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    // Getter.
    public Direccion getDireccion() {
        return direccion;
    }

    // Setter.
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Muestra la información de la persona.
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nRUT: " + rut
                + "\nDireccion: " + direccion;
    }

}