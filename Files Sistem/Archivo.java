public class Archivo {
    protected String name;

    // public asbtract ElementoFS getCopia(Condicion cc);

    public Archivo(String name){
        this.name = name;
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

