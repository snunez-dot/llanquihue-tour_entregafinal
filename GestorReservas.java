package cl.llanquihuetour.data;

import java.util.ArrayList;
import cl.llanquihuetour.model.Reserva;

/**
 * * Gestiona las reservas de los tours.
 */
public class GestorReservas {
    private final ArrayList<Reserva> reservas; 
    
    // Constructor. 
    public GestorReservas() {
        reservas = new ArrayList<>(); 
    } 
    
    // Agrega una reserva.
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva); 
    }
    
    // Lista las reservas.
    public String listarReservas() {

    String texto = "";

    for (Reserva reserva : reservas) {
        texto += reserva.toString() + "\n\n";
    }

    return texto;
}
    
    // Busca una reserva por su código.
    public Reserva buscarReserva(int codigoReserva) {

        for (int i = 0; i < reservas.size(); i++) {

            if (reservas.get(i).getCodigoReserva() == codigoReserva) {
            return reservas.get(i);
        }

    }

    return null;

}
    
    // Elimina una reserva por su código.
    public boolean eliminarReserva(int codigoReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getCodigoReserva() == codigoReserva) {
                reservas.remove(i); return true; 
            } 
        } 
        return false; 
    } 
    
    // Modifica una reserva existente. 
    public boolean modificarReserva(int codigoReserva, Reserva nuevaReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getCodigoReserva() == codigoReserva) {
                reservas.set(i, nuevaReserva); return true; 
            } 
        } 
        return false; 
    } 
}

