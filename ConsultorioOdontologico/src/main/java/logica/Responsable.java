
package logica;

import java.util.Date;

public class Responsable extends Persona{
    
    //atributos propios
    //private int id_responsable;
    private String tipoResposabilidad;

    public Responsable() {
    }

    public Responsable(String tipoResposabilidad, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipoResposabilidad = tipoResposabilidad;
    }

    

    public String getTipoResposabilidad() {
        return tipoResposabilidad;
    }

    public void setTipoResposabilidad(String tipoResposabilidad) {
        this.tipoResposabilidad = tipoResposabilidad;
    }
    
    
    
    
    
}
