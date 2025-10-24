package Avicola;
import java.time.LocalDate;

public class Productos{
    protected String name;  // get & set
    protected LocalDate fechaVencimiento;
    protected String num_lote;
    protected LocalDate fechaEvazado; // set& get
    protected String granja;

    public Productos(String name, LocalDate fechaVencimiento, String num_lote, LocalDate fechaEvazado, String granja) {
        this.name = name;
        this.fechaVencimiento = fechaVencimiento;
        this.num_lote = num_lote;
        this.fechaEvazado = fechaEvazado;
        this.granja = granja;
    }
}