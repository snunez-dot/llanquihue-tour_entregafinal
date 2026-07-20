package cl.llanquihuetour.data;

import java.util.ArrayList;
import cl.llanquihuetour.model.*;

/**
 * Gestiona las personas del sistema.
 */
public class GestorPersonas {

    private ArrayList<Cliente> clientes;
    private ArrayList<GuiaTuristico> guias;
    private ArrayList<Proveedor> proveedores;

    // Constructor.
    public GestorPersonas() {

        clientes = new ArrayList<>();
        guias = new ArrayList<>();
        proveedores = new ArrayList<>();

    }

    // Agrega un cliente.
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Agrega un guía.
    public void agregarGuia(GuiaTuristico guia) {
        guias.add(guia);
    }

    // Agrega un proveedor.
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    // Lista los clientes.
    public String listarClientes() {

    String texto = "";

    for (Cliente cliente : clientes) {
        texto += cliente.toString() + "\n\n";
    }

    return texto;

    }

    // Lista los guías.
    public void listarGuias() {

        for (int i = 0; i < guias.size(); i++) {
            System.out.println(guias.get(i));
        }

    }

    // Lista los proveedores.
    public void listarProveedores() {

        for (int i = 0; i < proveedores.size(); i++) {
            System.out.println(proveedores.get(i));
        }

    }
    public GuiaTuristico obtenerGuia(int posicion) {

    if (posicion >= 0 && posicion < guias.size()) {
        return guias.get(posicion);
    }

    return null;

    }

    public Proveedor obtenerProveedor(int posicion) {

        if (posicion >= 0 && posicion < proveedores.size()) {
        return proveedores.get(posicion);
    }

    return null;

}
 // Busca un cliente por su RUT.
    public Cliente buscarCliente(String rut) {

        for (int i = 0; i < clientes.size(); i++) {

        if (clientes.get(i).getRut().toString().equals(rut)) {
            return clientes.get(i);
        }

    }

    return null;
    
    }
    
    public boolean eliminarCliente(String rut) {

    for (int i = 0; i < clientes.size(); i++) {

        if (clientes.get(i).getRut().toString().equals(rut)) {

            clientes.remove(i);
            return true;

        }

    }

    return false;
    
    }
    
    public boolean modificarCliente(String rut, Cliente nuevoCliente) {

    for (int i = 0; i < clientes.size(); i++) {

        if (clientes.get(i).getRut().toString().equals(rut)) {

            clientes.set(i, nuevoCliente);
            return true;

        }

    }

    return false;

}
}