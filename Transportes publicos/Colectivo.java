import parcial.Vehiculo;

abstract public class Colectivo extends Vehiculo{
    private double costo_por;

    public Colectivo(double costo_por){
        // falta super(con parametros del padre, para una construccion completa)
        this.costo_por = costo_por;
    }

    public double getMantenimiento(){
        return this.costo_por * this.getAsientos() ;
    } 
}

// revisar atributos de c/ transporte
// this. esta bien en return? 

// lo mismo p/ colectivo corta media dist
// mant diario
// se definen atributos de vehiculos por un lado y los de taxi x otro?