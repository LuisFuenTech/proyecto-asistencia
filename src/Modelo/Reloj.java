/*
 Clase Reloj usada para obtener la hora y fecha del sistema
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author user
 */
public class Reloj{
    Calendar calendario = Calendar.getInstance(); //Intancia de la clase Calendar.
    String fecha;
    String hora;
    
    
    public String horaActual()
    {
        /*
            %tr Muestra la hora con el formato hora:minuto:segundo AM|PM, con dos dígitos para la hora,
             minuto y segundo
            Ejemplo: 11:56:19 AM
        */
       return hora = String.format("%tr", calendario);
    }
    
    public String fechaActual()
    {
        /*
        retorna un String con formato con el nombre del día, mes, numero y año.
        Ejemplo: MIÉRCOLES, NOVIEMBRE 07, 2007
        */
        return fecha = String.format("%1$TA, %1$TB %1$Td, %1$TY\n", calendario);
    }
    
    public String fechaCorta()
    {
        /*
            Retorna un String con la fecha en formato dd/mm/aaaa
        Ejemplo: 10/11/2017
        */
        return fecha = String.format("%tD", calendario);
    }
}
