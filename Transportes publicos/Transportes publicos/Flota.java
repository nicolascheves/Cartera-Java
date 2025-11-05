package parcial;
import java.util.ArrayList;

public class Flota extends Vehiculo{
    protected ArrayList<String> caracteristicas;
    protected ArrayList<Vehiculo> elementos;
    // Los arreglos String no requieren equals
    

    public Flota(){
        ArrayList<Vehiculo> elementos = new ArrayList<Vehiculo>();
    }

    public boolean flotaTieneCaracteristica(String caracteristica){
        for(int i = 0; i < elementos.size(); i++){
            if(elementos.get(i).contains(caracteristica))){ // hice la logica encima ; puse elementos.get(i).contains(caracteristica)
                return true;
            }
        }
        return false;
    }

    public double costoMantenimiento(Flota ff){
        
        for(int i=0; i<elementos.size(); i++){
            double costoTotal = 0;
            costoTotal += elementos.get(i).getCostoMantenimiento();
        }
        // busqueda profunda 

    }

}

        


