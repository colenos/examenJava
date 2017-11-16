/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author hernan
 */
public class TestNodo {
    
    public static void main(String[] args) {
        
        Nodo primer = new Nodo();
        primer.serInformacion(1);
        primer.imprimirNodos();
        
        Nodo segundo = new Nodo();
        segundo.serInformacion(2);
        
        primer.colcarNodo(segundo);
        
        primer.getNodo().imprimirNodos();
        
        Nodo tercero = new Nodo();
        tercero.serInformacion(3);
        
        
        
        primer.getNodo().colcarNodo(tercero); // es lo mismo segundo.colcarNodo(tercero);
        
    }
    
}
