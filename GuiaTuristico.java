package cl.llanquihuetour.model;

/**
 * Representa a un guía turístico del sistema.
 */
public class GuiaTuristico extends Persona {

    private String especialidad;

    // Constructor sin parámetros.
    public GuiaTuristico() {

    }

    // Constructor con parámetros.
    public GuiaTuristico(String especialidad, String nombre, Rut rut, Direccion direccion) {
        super(nombre, rut, direccion);
        this.especialidad = especialidad;
    }

    // Getter.
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter.
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Muestra los datos del guía turístico.
    @Override
    public void mostrarResumen() {
    System.out.println(toString());
}
    // Muestra la información del guía turístico.
    @Override
    public String toString() {
    return super.toString()
            + "\nEspecialidad: " + especialidad;
}
}