package cl.llanquihuetour.model;

/**
 * Representa a un cliente del sistema.
 */
public class Cliente extends Persona {

    // Constructor sin parámetros.
    public Cliente() {

    }

    // Constructor con parámetros.
    public Cliente(String nombre, Rut rut, Direccion direccion) {
        super(nombre, rut, direccion);
    }

    // Muestra los datos del cliente.
    @Override
    public void mostrarResumen() {
    System.out.println(toString());
}
    @Override
    public String toString() {
        return super.toString();
    }
}