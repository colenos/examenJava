/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos.Ejercicio1;
import java.util.LinkedList;
import java.util.Iterator;
/**
 *
 * @author hernan
 */
public class ListaAlumno {
    
    LinkedList lista = new LinkedList();
    Alumno objAlu;
    
    public void agregarLista(Alumno objAlu)
    {
        
        this.objAlu = objAlu;
        lista.add(this.objAlu.getNombre());
        
    }
    
    
    public void mostrarLista()
    {
        System.out.println(lista);
    }
    
    public void compararDato()
    {
      
        
        
    }
    
    
}
