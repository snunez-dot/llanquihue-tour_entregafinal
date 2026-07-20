
package cl.llanquihuetour.utils;

/**
 * Excepción que rescata el ingreso incorrecto de un RUT y lo personaliza.
 */

public class RutInvalidoException extends Exception {
    
    // Constructor sin parámetros.
    public RutInvalidoException() {
    }
    
    // Constructor con parámetros.
    public RutInvalidoException(String message) {
        super(message);
    }
    
}
