import java.util.ArrayList;
public class Link {
    //.. ??
    public ArrayList<Archivo> buscar(Condicion ff){
        return apuntado.buscar(ff);
    }

    public ElementoFS getCopia(Condicion cc){
        ElementoFS copiaApuntado = apuntado.getCopia(cc);
        if(copiaApuntado != null){
            return new Link(this.getNombre(), copiaApuntado);
        } else {
            return null;
        }
    }
}
