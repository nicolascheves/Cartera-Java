package Avicola;
public class CongeladoAire extends ProductosRefrigerados{
    // tiene los atributos de refrigerados

    protected double porcentajeNitrogeno; // set & get
    protected double porcentajeOxigeno; // set & get
    protected double porcentajeDioxidoCarbono; // set & get
    protected double porcentajeVaporAgua; // set & get

    // en el super van los nuevos y los de la clase padre
    public CongeladoAire(double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua, int temperatura, String codigoSupervisionAlimentaria) {
        super(temperatura, codigoSupervisionAlimentaria);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }
}


