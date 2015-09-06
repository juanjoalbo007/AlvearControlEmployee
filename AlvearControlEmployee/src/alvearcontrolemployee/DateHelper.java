/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvearcontrolemployee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Juanjo
 */
public class DateHelper {
    
    
    public static Date toDate(String fecha){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = Calendar.getInstance().getTime();
	try {
		date = formatter.parse(fecha);
                return date;
	} catch (ParseException e) {
		e.printStackTrace();
	}
        return date;
    }
}
