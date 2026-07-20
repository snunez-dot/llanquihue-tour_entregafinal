package cl.llanquihuetour.model;

/**
 * Representa a un proveedor del sistema.
 */
public class Proveedor extends Persona {

    private String servicio;

    // Constructor sin parámetros.
    public Proveedor() {

    }

    // Constructor con parámetros.
    public Proveedor(String servicio, String nombre, Rut rut, Direccion direccion) {
        super(nombre, rut, direccion);
        this.servicio = servicio;
    }

    // Getter.
    public String getServicio() {
        return servicio;
    }

    // Setter.
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    // Muestra un resumen del proveedor.
    @Override
    public void mostrarResumen() {
        System.out.println(toString());
    }

    // Muestra la información del proveedor.
    @Override
    public String toString() {
        return super.toString()
                + "\nServicio: " + servicio;
    }

}