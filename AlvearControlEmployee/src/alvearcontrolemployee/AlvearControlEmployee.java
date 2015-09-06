/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvearcontrolemployee;

import java.util.Calendar;

/**
 *
 * @author JJ
 */
public class AlvearControlEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        //System.out.println("Seb");
        Empleado e1 = new Empleado("Juan","Perez");
        Empleado e2 = new Empleado("Maria","Juarez");
        System.out.println(e1.getApellido()+", "+e1.getNombre());
        System.out.println(e2.getApellido()+", "+e2.getNombre());
        
        Ocurrencia o1 = new Ocurrencia();
        Ocurrencia o2 = new Ocurrencia();
        System.out.println("Occurrencia1: " + o1.getFechayHoraDate());
        System.out.println("Occurrencia2: " + o2.getFechayHoraDate());
        Calendar fecha = Calendar.getInstance();
        e1.getEntradas().add(o1);
        fecha.add(Calendar.HOUR_OF_DAY,2);
        o2.setFechaYHora(fecha);
        e1.getSalidas().add(o2);
        System.out.println("Occurrencia1: " + o1.getFechaYHora().getTime());
        System.out.println("Occurrencia2: " + o2.getFechaYHora().getTime());
        //System.out.println("comparación fechas1 y 2: "+o2.getFechaYHora().compareTo(o1.getFechaYHora()));
        
        Ocurrencia entrada = e1.getEntrada("05/09/2015");
        e1.mostrarOcurrencia(entrada);
        Ocurrencia salida = e1.getSalida("05/09/2015");
        e1.mostrarOcurrencia(salida);
        
                
//System.out.println("Get sólo año: "+fecha.get(Calendar.YEAR));
        //seba
        
        
    }
    
}
