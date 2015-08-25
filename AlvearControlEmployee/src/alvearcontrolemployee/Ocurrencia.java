/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvearcontrolemployee;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Juanjo
 */
public class Ocurrencia {

    private Calendar fechaYHora;
    
    public Ocurrencia()
    {
        this.fechaYHora = Calendar.getInstance();
    }
    
    public Calendar getFechaYHora() 
    {
        return fechaYHora;
    }

    public void setFechaYHora(Calendar fechaYHora)
    {
        this.fechaYHora = fechaYHora;
    }
    
    public static boolean sonIgualesPorFecha(Ocurrencia o1, Ocurrencia o2)
    {
        if(o1.getFechaYHora().get(Calendar.YEAR) == o2.getFechaYHora().get(Calendar.YEAR ) &&
           o1.getFechaYHora().get(Calendar.DAY_OF_YEAR) == o2.getFechaYHora().get(Calendar.DAY_OF_YEAR ) )
        {
            return true;
        }
        else return false;
    }
}
