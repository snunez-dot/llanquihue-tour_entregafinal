package cl.llanquihuetour.utils;

import cl.llanquihuetour.data.GestorPaquetes;
import cl.llanquihuetour.data.GestorPersonas;
import cl.llanquihuetour.data.GestorReservas;
import cl.llanquihuetour.model.Cliente;
import cl.llanquihuetour.model.Direccion;
import cl.llanquihuetour.model.Rut;
import cl.llanquihuetour.model.Reserva;
import cl.llanquihuetour.model.Tarjeta;
import cl.llanquihuetour.model.PaqueteTuristico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Lee la información desde archivos de texto.
 */
public class LectorTXT {

    public void leerClientes(String rutaArchivo, GestorPersonas gestorPersonas) {

        try {

            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();
                String[] datos = linea.split(";");

                String nombre = datos[1];
                Rut rut = new Rut(datos[2]);

                Direccion direccion = new Direccion(
                        datos[3],
                        Integer.parseInt(datos[4]),
                        datos[5],
                        datos[6]);

                Cliente cliente = new Cliente(nombre, rut, direccion);

                gestorPersonas.agregarCliente(cliente);

            }

            lector.close();

        } catch (FileNotFoundException e) {

            System.out.println("Error al leer el archivo de clientes.");

        }

    }
    
    public void leerPaquetes(String rutaArchivo, GestorPaquetes gestorPaquetes) {

        try {

        File archivo = new File(rutaArchivo);
        Scanner lector = new Scanner(archivo);

        while (lector.hasNextLine()) {

            String linea = lector.nextLine();
            String[] datos = linea.split(";");

            int codigo = Integer.parseInt(datos[0]);
            String nombre = datos[1];
            String destino = datos[2];
            int duracion = Integer.parseInt(datos[3]);
            String lugares = datos[4];
            String transporte = datos[5];
            String horario = datos[6];
            double precio = Double.parseDouble(datos[7]);
            String nombreGuia = datos[8];
            String nombreProveedor = datos[9];

            PaqueteTuristico paquete = new PaqueteTuristico(
                    codigo,
                    nombre,
                    destino,
                    duracion,
                    lugares,
                    transporte,
                    horario,
                    precio,
                    nombreGuia,
                    nombreProveedor
            );

            gestorPaquetes.agregarPaquete(paquete);

        }

        lector.close();

        } catch (FileNotFoundException e) {

        System.out.println("Error al leer el archivo de paquetes.");

    }

}
    public void leerReservas(String rutaArchivo,
        GestorReservas gestorReservas,
        GestorPersonas gestorPersonas,
        GestorPaquetes gestorPaquetes) {

        try {

        File archivo = new File(rutaArchivo);
        Scanner lector = new Scanner(archivo);

        while (lector.hasNextLine()) {

            String linea = lector.nextLine();
            String[] datos = linea.split(";");

            int codigo = Integer.parseInt(datos[0]);
            Cliente cliente = gestorPersonas.buscarCliente(datos[1]);
            PaqueteTuristico paquete = gestorPaquetes.buscarPaquete(
                    Integer.parseInt(datos[2]));

            String fecha = datos[3];
            int cantidad = Integer.parseInt(datos[4]);

            Tarjeta tarjeta = new Tarjeta(
                    datos[5],
                    datos[6],
                    datos[7]
            );

            Reserva reserva = new Reserva(
                    codigo,
                    cliente,
                    paquete,
                    tarjeta,
                    fecha,
                    cantidad
            );

            gestorReservas.agregarReserva(reserva);

        }

        lector.close();

        } catch (FileNotFoundException e) {

        System.out.println("Error al leer el archivo de reservas.");

    }

}

}