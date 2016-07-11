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
public class Bus {
    private Pasajero[] listaPasajeros;
    private float costoPasaje;

    public Bus() {
        this.listaPasajeros = new Pasajero[10];
        this.costoPasaje = 0.3F;
    }

    public float getCostoPasaje() {
        return costoPasaje;
    }
    
    
    
    
}
