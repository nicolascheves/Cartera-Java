public class Archivo {
    protected String name;

    public Archivo(String name){
        this.name = name;
    }

    // getSiguiente ~= buscar
    // no usa estrategia aca, sino UNA SI DEFINIDA (this.getEntregado() Booleano)
    public ElementoFS getSiguiente(Comparator<Archivo> estrategia){
        if(this.getTamanio()> 0.5){
            return this;
        } else return null;
    }

    // ~= buscar con criterio
    public int contarConCriterio(Condicion cc){
        if(cc.cumple(this)) return 1;
        else return 0;
    }
    
    // copia indiscriminada de Archivos
    public ElementoFS getCopia(){        
        return new Archivo(this.getNombre());   
    }

    // copia con condicion ; El tipo de duplicar esta bien?
    public Archivo duplicar(){
        return new Archivo();
    }

    public ElementoFS getCopia(Condicion cc){
        if(cc.cumple(this)){
            return new Archivo(this.getName());
        } else {
            return null;
        }
    }
}



