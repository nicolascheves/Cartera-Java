public abstract class ElementoFS {
    public abstract int getCantidad();
    public abstract double getTamanio();
    public abstract int archivosDeInteres(Condicion cc);
    public abstract ArrayList<ElementoFS> buscar(Condicion cc);
    public abstract Archivo getSiguiente(Comparator<Archivo> estrategia);
    public abstract ElementoFS getCopia(Condicion cc);
    public abstract ElementoFS getCopia();
    public abstract ElmentoFS duplicar();
}

