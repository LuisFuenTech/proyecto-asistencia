/*
    Esta clase contiene el mismo principio que la clase Programa en el package Programa.
    Por favor mirar esa clase antes.
*/
package Docente;

import java.util.ArrayList;
import java.util.List;

public class Docente 
{
    private String nomApe;

    public Docente() {
    }        

    public Docente(String nomApe) 
    {
        this.nomApe = nomApe;
    }

    public String getNomApe() 
    {
        return nomApe;
    }

    public void setNomApe(String nomApe) 
    {
        this.nomApe = nomApe;
    }
    
    public List<Docente> nombresDeSistema()
    {
        List<Docente> lista = new ArrayList <>();
        
        lista.add(new Docente("Carlos Cáseres"));        
        lista.add(new Docente("Jorge Acevedo"));
        lista.add(new Docente("Alexis Moreno"));
        lista.add(new Docente("Amaury Cabarcas"));        
        return lista;
    }
    
    public List<Docente> nombresDeAlimentos(){
        List<Docente> lista = new ArrayList <>();
        
        lista.add(new Docente("Atilano Arrieta"));        
        lista.add(new Docente("Edilbert Almanza"));
        lista.add(new Docente("Jesus Atencio"));
        lista.add(new Docente("Kevin Beltran"));        
        return lista;
    }
    
    public List<Docente> nombresDeCivil()
    {
        List<Docente> lista = new ArrayList <>();        
                
        lista.add(new Docente("Claudia Pérez"));
        lista.add(new Docente("Enilsa Perez"));
        lista.add(new Docente("Julio Padilla"));
        lista.add(new Docente("Luis Arrieta"));        
        return lista;
    }
}
