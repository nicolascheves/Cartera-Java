package busqueda;
public class CondicionAnd exteds Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    boolean cumple(TransportePublico tp) {
        return c1.cumple(tp) && c2.cumple(tp);
    }
    
}
