public class DirectorioOculto extends Directorio{
    // no hace atributo nuevo

    public DirectorioOculto(String nombre) {
        super(nombre); // llama al constructor de la superclase           
    }

    public Directorio getCopiaVacia(){
        return new DirectorioOculto(this.nombre);
    }
}
