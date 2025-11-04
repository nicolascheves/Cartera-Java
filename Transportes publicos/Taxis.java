import parcial.Vehiculo;

public class Taxis extends Vehiculo{
    private double valor;
    private double extra;
    private int anio_minimo;
    public Taxis(double valor, double extra, int anio_minimo){
        super();
        this.valor = valor;
        this.extra = extra;
        this.anio_minimo = anio_minimo;
    }

    public double costoMantenimiento(){
        valor = this.valor;
        if(this.getModelo() > anio_minimo){

            valor += extra;
        }
        return valor;
    }
}
