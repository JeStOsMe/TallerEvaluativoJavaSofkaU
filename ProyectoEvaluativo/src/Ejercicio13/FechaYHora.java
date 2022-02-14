/*
 * Realizar un algoritmo que permita consultar la fecha y la hora en el formato
 * (AAAA/MM/DD) (HH:MM:SS)
 */
package Ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jeaniel Osorno
 */
public class FechaYHora {
    
    public static void main(String[] args) {
        Date fechayHora = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
        
        System.out.println("     ***** Fecha y hora actual *****");
        System.out.println("En este instante (sin formato): " + fechayHora);
        System.out.println("En este instante (con formato): " + formatter.format(fechayHora));
    }
    
}
