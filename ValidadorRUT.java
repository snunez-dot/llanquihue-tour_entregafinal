
package cl.llanquihuetour.utils;

/**
 * Valida que el RUT esté ingresado correctamente.
 */

public class ValidadorRUT {

    // Constructor vacio.
    public ValidadorRUT() {
        
    }
    
    // Validador.
    public static boolean validarRut(String rut) 
        throws RutInvalidoException {
        
        if(rut == null || rut.trim().isEmpty()) {
            throw new RutInvalidoException( "El RUT no puede estar vacio.");
        }
        
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        
        if (rut.length() < 8 || rut.length() > 9) {
            throw new RutInvalidoException("El RUT ingresado supera los caracteres.");
            
    }
        return true;
    }
    }
       
   