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
    private float peso;

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String ap) {
        this.apellido = ap;
    }

    public String getApellido() {
        return apellido;
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
    
    @Override
    public String toString(){
        return String.format("%s % tiene %d años", getNombre(), getApellido(), getEdad());
    }
    
}
