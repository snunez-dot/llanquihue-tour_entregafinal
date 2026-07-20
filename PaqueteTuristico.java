package cl.llanquihuetour.model;

/**
 * Representa un paquete turístico ofrecido por la empresa.
 */
public class PaqueteTuristico {

    private int codigoPaquete;
    private String nombre;
    private String destino;
    private int duracionDias;
    private String lugaresInteres;
    private String transporte;
    private String horario;
    private double precio;
    private String nombreGuia;
    private String nombreProveedor;

    // Constructor sin parámetros.
    public PaqueteTuristico() {

    }

    // Constructor con parámetros.
    public PaqueteTuristico(int codigoPaquete, String nombre, String destino,
            int duracionDias, String lugaresInteres,
            String transporte, String horario,
            double precio, String nombreGuia,
            String nombreProveedor) {

        this.codigoPaquete = codigoPaquete;
        this.nombre = nombre;
        this.destino = destino;
        this.duracionDias = duracionDias;
        this.lugaresInteres = lugaresInteres;
        this.transporte = transporte;
        this.horario = horario;
        this.precio = precio;
        this.nombreGuia = nombreGuia;
        this.nombreProveedor = nombreProveedor;

    }

    // Getters y setters

    public int getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(int codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public String getLugaresInteres() {
        return lugaresInteres;
    }

    public void setLugaresInteres(String lugaresInteres) {
        this.lugaresInteres = lugaresInteres;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreGuia() {
        return nombreGuia;
    }

    public void setNombreGuia(String nombreGuia) {
        this.nombreGuia = nombreGuia;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

   
    
    @Override
    public String toString() {
        return "Paquete: " + nombre
                + "\nCódigo: " + codigoPaquete
                + "\nDestino: " + destino
                + "\nDuración: " + duracionDias + " días"
                + "\nLugares de interés: " + lugaresInteres
                + "\nTransporte: " + transporte
                + "\nHorario: " + horario
                + "\nPrecio: $" + precio
                + "\nGuía: " + nombreGuia
                + "\nProveedor: " + nombreProveedor;
    }

}