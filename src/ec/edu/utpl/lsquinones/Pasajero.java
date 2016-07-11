/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.lsquinones;

/**
 *
 * @author Santiago Quiñones
 */
public class Pasajero {
    private String nombre;
    private String apellido;
    private int edad;

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String ap) {
        this.apellido = ap;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad >= 0 ? edad : 0;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }
    
}
