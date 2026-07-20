package cl.llanquihuetour.model;

/**
 * Representa una reserva realizada por un cliente.
 */
public class Reserva {

    private int codigoReserva;
    private Cliente cliente;
    private PaqueteTuristico paquete;
    private Tarjeta tarjeta;
    private String fechaReserva;
    private int cantidadPersonas;

    // Constructor sin parámetros.
    public Reserva() {

    }

    // Constructor con parámetros.
    public Reserva(int codigoReserva, Cliente cliente,
            PaqueteTuristico paquete, Tarjeta tarjeta,
            String fechaReserva, int cantidadPersonas) {

        this.codigoReserva = codigoReserva;
        this.cliente = cliente;
        this.paquete = paquete;
        this.tarjeta = tarjeta;
        this.fechaReserva = fechaReserva;
        this.cantidadPersonas = cantidadPersonas;

    }

    // Getters y setters.

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PaqueteTuristico getPaquete() {
        return paquete;
    }

    public void setPaquete(PaqueteTuristico paquete) {
        this.paquete = paquete;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNombre()
                + "\nCodigo: " + codigoReserva
                + "\nPaquete: " + paquete.getNombre()
                + "\nFecha de reserva: " + fechaReserva
                + "\nCantidad de personas: " + cantidadPersonas
                + "\nTarjeta: " + tarjeta.getNumeroTarjeta();
    }

}