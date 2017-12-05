/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen2017;


public class Nodo {
    private Obra dato;
    private Nodo hijoIzq;
    private Nodo hijoDer;

    public Nodo(Obra dato) {
        this.dato = dato;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    public Obra getDato() {
        return dato;
    }

    public void setDato(Obra dato) {
        this.dato = dato;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
    
}
