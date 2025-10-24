public class Archivo {
    protected String name;

    // public asbtract ElementoFS getCopia(Condicion cc);

    public Archivo(String name){
        this.name = name;
    }

    public Archivo getCopia(Condicion cc){
        Archivo copia = new Archivo(this.getNombre());
        return copia;   
    }

    // copia con condicion
    public Archivo getCopia(Condicion cc){
        if(cc.cumple(this)){
            return new Archivo(this.name);
        } else {
            return null;
        }
    }
}
