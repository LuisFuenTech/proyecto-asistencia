/*
    Clase Archivo creada para generar un fichero .txt cuando es llamada desde un form.
    Esta contien un método que recibe como parámetro una Lista de objetos Estudiante.
*/
package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;//Necesario para escribir fichero
import java.io.IOException;
import java.util.List;

public class Archivo 
{
    private BufferedWriter escritura; //Objeto archivo de la clase BufferedWriter
    private String name;
    private javax.swing.JFrame form2; //Recibe el form del cual es llamada.
    private List<Estudiante> registroEstudiantes;
    private File carpeta = new File("Registros"); 
    private File archivo;
    String path = carpeta.getAbsolutePath();

    public BufferedWriter getEscritura() {
        return escritura;
    }

    public void setEscritura(BufferedWriter escritura) {
        this.escritura = escritura;
    }

    public File getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(File carpeta) {
        this.carpeta = carpeta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    
    public javax.swing.JFrame getForm2() 
    {
        return form2;
    }

    public void setForm2(javax.swing.JFrame form2) 
    {
        this.form2 = form2;
    }

    public List<Estudiante> getRegistroEstudiantes() 
    {
        return registroEstudiantes;
    }

    public void setRegistroEstudiantes(List<Estudiante> registroEstudiantes) 
    {
        this.registroEstudiantes = registroEstudiantes;
    }    

    //Métodos propios de la creación del archivo
    public void crearArchivo() throws IOException
    {
        if(carpeta.exists())
        {
            archivo = new File(path, name+".txt");
            //escritura = new BufferedWriter(new FileWriter(archivo));
        }
        else
        {
            carpeta.mkdir();
            archivo = new File(path, name+".txt");
        }
        //archivo = new FileWriter(name+".txt");//  Intancia de la creación del fichero con el nombre asignado con setName.
        //Este se guarda en la carpeta del proyecto.
    }
    //Método para guardar la información en el fichero creado anteriormente.
    public void guardarInformacion() throws IOException
    {
        escritura = new BufferedWriter(new FileWriter(archivo));
        String newLine = System.getProperty("line.separator");//Salto de linea para String.format.
        escritura.write(String.format("%-25s %-25s %-25s %-35s %-28s "
                + "%-24s %-24s %-24s %s", "NOMBRE", "APELLIDO", "CODIGO", "PROGRAMA",
                "CLASE", "PROFESOR", "JORNADA", "FECHA", newLine));//el metodo write nos permite guardar la información
        //en el archivo que hemo creado.
        
        /*
        Por cada elemento del arrayList registroEstudiante, se le asigna un objeto Estudiante a la variable lista.
        Luego esta es guardada en el archivo con el metodo toStringf().
        */
        for(Estudiante lista: registroEstudiantes)
        {
            escritura.write(lista.toStringf());
        }
        escritura.close();//Es necesario cerrar el fichero  creado.
    }
}
