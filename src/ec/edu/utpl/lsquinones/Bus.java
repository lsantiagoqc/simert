

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
    
    public Pasajero[] getListaPasajeros(){
        return this.listaPasajeros;
    }
    
    
    
}
