
package cl.llanquihuetour.model;

public class Rut {
    private String rut;
    
    // Constructor sin parámetros.
    public Rut (){
    }

    // Constructor con parámetros.
    public Rut(String rut) {
        this.rut = rut;
    }

    // Getter
    public String getRut() {
        return rut;
    }

    // Setter
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    // Muestra el rut ingresado.
    @Override
    public String toString() {
        return rut;
    }
    }
