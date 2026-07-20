package cl.llanquihuetour.model;

/**
 * Representa la dirección de una persona.
 */
public class Direccion {

    private String calle;
    private int numero;
    private String comuna;
    private String ciudad;

    // Constructor sin parámetros.
    public Direccion() {

    }

    // Constructor con parámetros.
    public Direccion(String calle, int numero, String comuna, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.ciudad = ciudad;
    }

    // Getter.
    public String getCalle() {
        return calle;
    }

    // Setter.
    public void setCalle(String calle) {
        this.calle = calle;
    }

    // Getter.
    public int getNumero() {
        return numero;
    }

    // Setter.
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getter.
    public String getComuna() {
        return comuna;
    }

    // Setter.
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    // Getter.
    public String getCiudad() {
        return ciudad;
    }

    // Setter.
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Muestra la direccion ingresada.
    @Override
    public String toString() {
        return calle + " " + numero + ", " + comuna + ", " + ciudad;
    }
}
