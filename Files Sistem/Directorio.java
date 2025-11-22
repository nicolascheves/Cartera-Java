public class Directorio extend ElementoFS{
    // vamos a hacer Copia Profunda de Objetos y sus Subclases 
    protected String nombre;


    public Directorio(String nombre) {
        this.nombre = nombre;
    }

    // busqueda en profundidad con estrategia indeterminada (comparator)
    public Archivo getSiguiente(Comparator<Archivo> estrategia){
        Archivo siguiente = null;
        for(ElementoFS e:elementos){
            ElementoFS archSiguiente = e.getSiguiente(estrategia);
            if(asignarNuevoSiguiente(siguiente, archSiguiente, estrategia)){
                siguiente = archSigueiente;
            }
        }
        return siguiente;
    }

    public boleean asignarNuevoSig(Archivo inicial, ElementFS hijos, Comparator<Archivo> estrategia){
        return (inicial== null || hijos !=null && estrategia.compare(hijos, anterior) < 0));
    }

    // contar objetos con criterio ) busqueda ~= 
    public int archivoDeInteres(Condicion cc){
        int suma = 0;
        for (ElementoFS e:elementos){
            suma += e.archivoDeInteres(cc);
            if (contable(e, cc)) {
                suma++;
            }
        }
        return suma;
    }

    public boolean contable(ElementoFS e, Condicion cc){
        return cc.cumple(e) && e.getTamanio() > 5;
    }        

    // retorna lista con un criterio de busqueda
        
    // Copia a profundidad con un criterio de seleccion (sin sub arreglo x archivo)
    public ElementoFS getCopia(Condicion cc){
        Directorio copia = duplicar();
        boolean copiable = false;

        for(ElementoFS elem:elementos){

            ElementoFS copiasH = elem.getCopia(cc);
            if(copiasH != null){
                copia.agregarElemento(copiasH);
                copiable = true;
            }    
        }
        if(copiable){ 
            return copia;
        } else {
            return null;
        }
    }
    
    public Directorio duplicar(){
        return new Directorio(this.getName());
    }

    // busqueda| condicion , add x .doc
    // Copia con condicion

}


