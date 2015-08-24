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
        System.out.println("Occurrencia1: "+o1.getFechaYHora());
        System.out.println("Occurrencia2: "+o2.getFechaYHora());
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.HOUR_OF_DAY,-5);
        o2.setFechaYHora( fecha.getTime());
        System.out.println("Occurrencia2: "+o2.getFechaYHora());
        System.out.println("comparación fechas1 y 2: "+o2.getFechaYHora().compareTo(o1.getFechaYHora()));
        
        System.out.println("Get sólo año: "+fecha.get(Calendar.YEAR));
        
    }
    
}
