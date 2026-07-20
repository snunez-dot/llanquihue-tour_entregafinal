package cl.llanquihuetour.data;

import java.util.ArrayList;
import cl.llanquihuetour.model.PaqueteTuristico;

/**
 * Gestiona los paquetes turísticos.
 */
public class GestorPaquetes {
    private final ArrayList<PaqueteTuristico> paquetes;

    // Constructor.
    public GestorPaquetes() {
        paquetes = new ArrayList<>();
    }

    // Agrega un paquete.
    public void agregarPaquete(PaqueteTuristico paquete) {
        paquetes.add(paquete);
    }

    // Lista los paquetes.
    public String listarPaquetes() {

    String texto = "";

    for (PaqueteTuristico paquete : paquetes) {
        texto += paquete.toString() + "\n\n";
    }

    return texto;

    }
    // Busca un paquete por su código.
    public PaqueteTuristico buscarPaquete(int codigoPaquete) {

        for (int i = 0; i < paquetes.size(); i++) {

        if (paquetes.get(i).getCodigoPaquete() == codigoPaquete) {
            return paquetes.get(i);
        }

    }

    return null;

}
    // Elimina un paquete por su código.
    public boolean eliminarPaquete(int codigoPaquete) {

        for (int i = 0; i < paquetes.size(); i++) {

        if (paquetes.get(i).getCodigoPaquete() == codigoPaquete) {

            paquetes.remove(i);
            return true;

        }

    }

    return false;

}
    // Modifica un paquete existente.
    public boolean modificarPaquete(int codigoPaquete,
        PaqueteTuristico nuevoPaquete) {

        for (int i = 0; i < paquetes.size(); i++) {

        if (paquetes.get(i).getCodigoPaquete() == codigoPaquete) {

            paquetes.set(i, nuevoPaquete);
            return true;

        }

    }

    return false;

}

}