/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen2017;

/**
 *
 * @author hernan
 */
public class Obra {
    
    private int codigo;
    private String nombreEncargado;
    private String tipo;
    private int adjudicacion;
    private int valorObra;

    public Obra() {
    }

    public Obra(int codigo, String nombreEncargado, String tipo, int adjudicacion, int valorObra) {
        this.codigo = codigo;
        this.nombreEncargado = nombreEncargado;
        this.tipo = tipo;
        this.adjudicacion = adjudicacion;
        this.valorObra = valorObra;
    }
    
    public Obra(int codigo,String nombre, String nombreEncargado, int adjudicacion)
    {
        this.codigo = codigo;
        this.nombreEncargado = nombreEncargado;
        this.adjudicacion = adjudicacion;
       
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAdjudicacion() {
        return adjudicacion;
    }

    public void setAdjudicacion(int adjudicacion) {
        this.adjudicacion = adjudicacion;
    }

    public int getValorObra() {
        return valorObra;
    }

    public void setValorObra(int valorObra) {
        this.valorObra = valorObra;
    }

    @Override
    public String toString() {
        return "Obra{" + "codigo=" + codigo + ", nombreEncargado=" + nombreEncargado + ", tipo=" + tipo + ", adjudicacion=" + adjudicacion + ", valorObra=" + valorObra + '}';
    }
    
    
    
}
