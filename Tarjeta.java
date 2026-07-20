package cl.llanquihuetour.model;

/**
 * Representa una tarjeta de pago.
 */
public class Tarjeta {

    private String numeroTarjeta;
    private String titular;
    private String fechaVencimiento;

    // Constructor sin parámetros.
    public Tarjeta() {

    }

    // Constructor con parámetros.
    public Tarjeta(String numeroTarjeta, String titular,
                   String fechaVencimiento) {

        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;

    }

    // Getter.
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    // Setter.
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    // Getter.
    public String getTitular() {
        return titular;
    }

    // Setter.
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter.
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    // Setter.
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    // Muestra la información de la tarjeta.
    @Override
    public String toString() {
        return "Titular: " + titular
                + "\nNúmero: " + numeroTarjeta
                + "\nVencimiento: " + fechaVencimiento;
    }

}