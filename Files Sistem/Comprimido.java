public class Comprimido extends Directorio{
    //  Como extiende de Drctrio ya tengo implementado el getcopia

    protected String nombre;

    public Comprimido(String nombre) {
        this.nombre = nombre;
    }

    // sobreescribe
    public Directorio getCopiaVacia(){
        return new Comprimido(this.getNombre())
    }
}
