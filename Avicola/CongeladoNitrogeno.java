import Avicola.ProductosRedrigerados;

public class CongeladoNitrogeno extends ProductosRedrigerados{
    protected String metodo;
    protected double segundos; // set & get

    public CongeladoNitrogeno(double segundos,String metodo, int temperatura, String codigoSupervisionAlimentaria) {
        super(temperatura, codigoSupervisionAlimentaria);
        this.segundos = segundos;
        this.metodo = metodo; 
    }
    
}
