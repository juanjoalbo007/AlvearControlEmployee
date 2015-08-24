
package alvearcontrolemployee;
import java.util.Calendar;
import java.util.List;

public class Empleado {
    private String nombre;
    private String apellido;
    private List <Ocurrencia> ocurrencias;
    public Empleado(String Nombre, String Apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
  
  
    
    

