package alvearcontrolemployee;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Empleado {
    private String nombre;
    private String apellido;
    private List <Ocurrencia> entradas;
    private List <Ocurrencia> salidas;
    
    
    public Empleado(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.entradas = new <Ocurrencia>ArrayList();
        this.salidas = new <Ocurrencia>ArrayList();
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
    
    public void addEntrada (Ocurrencia ocurrencia){
        this.entradas.add(ocurrencia);
    }
    
    public void addSalida (Ocurrencia ocurrencia){
        this.salidas.add(ocurrencia);
    }
    
    public List<Ocurrencia> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Ocurrencia> entradas) {
        this.entradas = entradas;
    }

    public List<Ocurrencia> getSalidas() {
        return salidas;
    }

    public void setSalidas(List<Ocurrencia> salidas) {
        this.salidas = salidas;
    }
    
    public Ocurrencia getEntrada (String fecha){
        return this.buscarOcurrencia(fecha, entradas);
    }
    
    public Ocurrencia getSalida (String fecha){
        return this.buscarOcurrencia(fecha, salidas);
    }
    public Ocurrencia buscarOcurrencia(String fecha, List <Ocurrencia> ocurrencias){        
        Calendar fechaIngresada = Calendar.getInstance();
        fechaIngresada.setTime(DateHelper.toDate(fecha));
        Ocurrencia fechaAEncontrar = new Ocurrencia();
        fechaAEncontrar.setFechaYHora(fechaIngresada);
        Ocurrencia ocurrenciaEncotrada = null;
        for (Ocurrencia ocurrencia: ocurrencias){
            if(Ocurrencia.sonIgualesPorFecha(ocurrencia, fechaAEncontrar)){
                ocurrenciaEncotrada = ocurrencia;
            }
            
        }
        return ocurrenciaEncotrada;
        
    }
    
    public void mostrarOcurrencia(Ocurrencia ocurrencia){
        System.out.println(ocurrencia.getFechaYHora().getTime().toString());
    }
}