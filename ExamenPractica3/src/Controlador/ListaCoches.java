package Controlador;
import Modelo.Coche;
import java.util.ArrayList;
import java.util.Collection;

public class ListaCoches extends ArrayList<Coche>{
    int actual;

    public ListaCoches(int actual, int initialCapacity) {
        super(initialCapacity);
        this.actual = actual;
    }

    public ListaCoches(int actual) {
        this.actual = actual;
    }

    public ListaCoches(int actual, Collection<? extends Coche> c) {
        super(c);
        this.actual = actual;
    }
    
    public boolean esVacia(){
        return isEmpty();
    }
    
    public boolean esUltimo(){
        return isEmpty() || actual == size() - 1;
    }
    
    public boolean esPrimero(){
        return isEmpty() || actual == 0;
    }
    
    public void avanzar(){
        if(!esUltimo()){
            actual++;
        }
    }
    
    public void retroceder(){
        if(!esPrimero()){
            actual--;
        }
    }
    
    public void irAlPrimero(){
        actual = 0;
    }
    
    public  void irAlUltimo(){
        if (isEmpty()){
            actual = 0;
        }else {
            actual = size() - 1;
        }
        
    }
    
    public void añadirCoche(Coche coche){
        add(coche);
        actual = size()-1;
    }
    
    
    public void borrarCoche(){
        if (isEmpty()){
            return;
        }
        remove(actual);
        if (actual >= size()){
            actual = size() - 1;
        }
        if (actual<0){
            actual = 0;
        }
    }
    
    public Coche obtenerCocheActual(){
        if(isEmpty()){
            return null;
        }else{
            return get(actual);
        }
    }
    
    public void ordenarPorMatricula(){
        /*Coche seleccionado = obtenerCocheActual();
        Coche a;
        Coche b;
        for(int i = 0;i<= size();i++){
        }   */
        Coche seleccionado = obtenerCocheActual();
        sort((a, b) -> Integer.compare(int)(a.getMatricula(), b.getMatricula()));
        if (seleccionado != null) {
            actual = indexOf(seleccionado);
        }
        
    }
    
}
