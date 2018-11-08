/*
    Clase programa que contiene método con List para el llenado de las combox en el form Entrada.
*/
package Programa;

import java.util.ArrayList;
import java.util.List;

public class Programa 
{
    private String programa;
    
    //Constructor con parámetro para instanciarlo con nombre de la clase
    public Programa(String programa)
    {
        this.programa = programa;
    }

    public Programa() {
        
    }

    public String getPrograma() 
    {
        return programa;
    }

    public void setPrograma(String programa) 
    {
        this.programa = programa;
    }    

    /*
        Método que retorna un List de objeto Programa con el atributo programa, el cual tendrá el nombre
        de las asignaturas.
    */
    public List<Programa> asignaturasDeSistemas()
    {
        List<Programa> lista = new ArrayList <>();//Crear un ArrayList tipo Programa
        //Se le asigna un objeto de la clase Programa (Esta misma), con nombre de la clase, este es agregado a la list.
        lista.add(new Programa("Programación a obj.  "));
        lista.add(new Programa("Cálculo vectorial    "));
        lista.add(new Programa("Física teórica ll    "));
        lista.add(new Programa("Metodología          "));        
        return lista;//Retorna la lista con los objetos Programa con cada clase.
    }
    
    public List<Programa> asignaturasDeAlimentos()
    {
        List<Programa> lista = new ArrayList <>();
        
        lista.add(new Programa("Cálculo diferencial  "));
        lista.add(new Programa("Gestión humana       "));
        lista.add(new Programa("Física teórica ll    "));
        lista.add(new Programa("Proceso industrial   "));        
        return lista;
    }
    
    public List<Programa> asignaturasDeCivil()
    {
        List<Programa> lista = new ArrayList <>();
        
        lista.add(new Programa("Diseño de estructuras"));        
        lista.add(new Programa("Salud ocupacional    "));
        lista.add(new Programa("Cálculo diferencial  "));
        lista.add(new Programa("Física teórica ll    "));        
        return lista;
    }
}
