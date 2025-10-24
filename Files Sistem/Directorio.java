public class Directorio extend ElementoFS{
    // vamos a hacer Copia Profunda de Objetos y sus Subclases 
    protected String nombre;


    public Directorio(String nombre) {
        this.nombre = nombre;
    }

    // public Directorio getCopia(){
    public Directorio getCopia(Condicion cc){
        // con esto, automaticamente (no necesito definir el oculto)
        // Directorio copia = this.getnombre();?
        Directorio copia = this.getCopiaVacia();

        // controla si no es un contendore vacio
        boolean seAgregoAlgo = false;

        for(ElementoFS elem:elementos){

            ElementoFS copiaElem = elem.getCopia(cc);
            if(copiaElem != null){
                copia.agregarElemento(elem.getCopia());
                // copia.agregarElemento(copiaElem);
                seAgregoAlgo = true;
            }    
        }
        if(seAgregoAlgo){
            return copia;
        } else {
            return null;
        }
    }
    
    public Directorio getCopiaVacia(){
        return new Directorio(this.nombre);
    }

    // busqueda| condicion , add x .doc
    // Copia con condicion

}
