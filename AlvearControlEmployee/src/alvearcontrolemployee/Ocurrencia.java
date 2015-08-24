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

    private Date fechaYHora;
    
    public Ocurrencia()
    {
        this.fechaYHora = Calendar.getInstance().getTime();
    }
    
    public Date getFechaYHora() 
    {
        return fechaYHora;
    }

    public void setFechaYHora(Date fechaYHora)
    {
        this.fechaYHora = fechaYHora;
    }
}
