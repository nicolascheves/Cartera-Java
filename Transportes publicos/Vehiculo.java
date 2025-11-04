package parcial; 
import java.lang.reflect.Array;
import java.util.ArrayList;   
public abstract class Vehiculo extends transporte {

    protected String patente;
    protected int anios_modelo;
    protected int asientos;
    protected double km_recorridos;
    protected ArrayList<String> caracteristicas;
    // No requiere de Equals ya que es un String y ya lo tiene implementado

    // pase caracteristicas como un parametros )=
    public Vehiculo(String patente, int anios_modelo, int asientos, double km_recorridos) {
        this.patente = patente;
        this.anios_modelo = anios_modelo;
        this.asientos = asientos;
        this.km_recorridos = km_recorridos;
        ArrayList<String> caracteristicas = new ArrayList<String>();
    }

    }
    public void addCaracteristica(String caracteristica) {
        caracteristicas.add(caracteristica);
    }

    public boolean tieneCaracteristica(String caracteristica) {
        for(ArrayList<String> elem: caracteristicas){
            if(elem.contains(caracteristica)){
                return true; 
            }
        }
    }
    public String getPatente(){
        return this.patente;
    }
    public int getAnios(){
        return this.anios_modelo;
    }
    public int getAsientos(){
        return this.asientos;
    }



}