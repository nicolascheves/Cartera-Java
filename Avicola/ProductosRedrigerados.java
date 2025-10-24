package Avicola;
public class ProductosRedrigerados extends Productos{
    protected int temperatura; // set & get
    protected String codigoSupervisionAlimentaria; 
    
    // plantuml
    public ProductosRedrigerados(int temperatura, String codigoSupervisionAlimentaria) {
        super(name, fechaVencimiento, num_lote, fechaEvazado, granja);
        this.temperatura = temperatura;
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;

    }
}