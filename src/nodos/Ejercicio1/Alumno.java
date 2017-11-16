/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos.Ejercicio1;

/**
 *
 * @author hernan
 */
public class Alumno {
    
    private int edad;
    private String nombre;
    private char sexo;

    public Alumno(int edad, String nombre, char sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
}
