/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos.Ejercicio1;

/**
 *
 * @author hernan
 */
public class TestEjer1 {
    
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno(23,"Juan",'m');
        Alumno alu2 = new Alumno(32,"Juanita",'f');
        Alumno alu3 = new Alumno(2,"juanito",'m');
        
        ListaAlumno l = new ListaAlumno();
        
        l.agregarLista(alu1);
        l.agregarLista(alu3);
        l.agregarLista(alu2);
        l.mostrarLista();
        l.compararDato();
        
        
    }
    
}
