package Avicola;
public class CongeladoAgua extends ProductosRefrigerados{
    protected double salinidad; // set & get

    public CongeladoAgua(double salinidad, int temperatura, String codigoSupervisionAlimentaria) {
        super(temperatura, codigoSupervisionAlimentaria);
        this.salinidad = salinidad;
    }
    
}
