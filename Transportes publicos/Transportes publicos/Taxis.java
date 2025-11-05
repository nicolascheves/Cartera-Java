import parcial.Vehiculo;

public class Taxis extends Vehiculo{
    private double costo_por;
    private double extra;
    private int anio_minimo;

    public Taxis(double costo_por, double kilometrosRecorridos, double extra, int anio_minimo){
        
        this.costo_por = costo_por;
        this.extra = extra;
        this.anio_minimo = anio_minimo; 
    }

    public double costoMantenimiento(){
        costo_por = this.costo_por * this.getKilometrosRecorridos();

        if(this.getModelo() < anio_minimo){

            costo_por += extra;
        }
        return costo_por;
    }
}
