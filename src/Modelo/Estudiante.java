/*
    Clase Estudiante creada para obtener el modelo de los objetos estudiantes creados en el futuro.
    El atributo "clase" guarda la clase a la cual asiste.
    El atributo "docente" guarda el nombre del docente de la clase asistida.
*/
package Modelo;

public class Estudiante 
{
    //Declaración de los atributos de la clase Estudiante.
    private String nombre;
    private String apellido;
    private String codigo;
    private String programa;
    private String jornada;
    private String clase;
    private String docente;
    Reloj reloj = new Reloj();//Intancia del objeto reloj de la clase "Reloj" usado para obtener la hora y fecha del sistema.

    //Constructor con parámetros de la clase
    public Estudiante(String nombre, String apellido, String codigo, 
            String programa, String jornada,String clase, String docente) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.programa = programa;
        this.jornada = jornada;
        this.clase = clase;
        this.docente = docente;
    }
    
    //Inicio de los setters y getters
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }

    public String getPrograma() 
    {
        return programa;
    }

    public void setPrograma(String programa) 
    {
        this.programa = programa;
    }

    public String getJornada() 
    {
        return jornada;
    }

    public void setJornada(String jornada) 
    {
        this.jornada = jornada;
    }
    
    public String getClase() 
    {
        return clase;
    }

    public void setClase(String clase) 
    {
        this.clase = clase;
    }
    
    public String getDocente() 
    {
        return docente;
    }

    public void setDocente(String docente) 
    {
        this.docente = docente;
    }//Fin de los setters y getters.

    /*Método creado para retornar una cadena con la información del estudiante.
        fechaCorta() es un método de la clase Reloj que retorna la fecha corta dd/mm/aaaa del sistema
        horaActual() es un método de la clase Reloj que retorna la hora actual del sistema.
    */
    
    @Override
    public String toString() 
    {
        
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCodigo: " + 
                codigo + "\nPrograma: " + programa + "\nJornada: " + jornada + 
                "\nClase: " + clase + "\nProfesor: " + docente + "\nFecha: " 
                + reloj.fechaCorta() + "\nHora: " + reloj.horaActual() +"\n";
    }

    //Método usado para guardar la información en los ficheros.
    public String toStringf() {
        /*
            System.getProperty("line.separator") genera un salto de linea tipo String asignado a una variable, usado para
            hacer los saltos de lineas cuando se usa "String.format".
            *String.format permite guardar una cadena con formato.
        */
        String mostrar="", newLine = System.getProperty("line.separator");
        
        return mostrar = String.format("%-25s %-25s %-25s %-25s %-25s %-25s"
                + " %-25s %s %s %s", nombre, apellido, codigo, programa,  clase, 
                docente, jornada, reloj.fechaCorta(), reloj.horaActual(), newLine);
    }
}
 