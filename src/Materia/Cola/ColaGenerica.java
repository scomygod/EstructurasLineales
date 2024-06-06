package Materia.Cola;
import java.util.NoSuchElementException;
import Materia.Models.NodoGenerico;

public class ColaGenerica<T> {
    private NodoGenerico <T> first;
    private NodoGenerico <T> last;
    private int size;

    public ColaGenerica(){
        this.size = 0;
    }
    public void addNode (T data){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;     
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
        size++;
    }
    public T remove (){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía. ");
        }
        T value = first.data;
        first = first.next;
        size--;

        if (first==null) {
            last = null;
        }
        return value;
    }
        //Método para obtener y no sacar
        public T peek(){
            if (isEmpty()) {
                throw new NoSuchElementException("La cola está vacía. ");
            }
            return first.data;
        }
    
        //Método para verificar si está vacía
        public boolean isEmpty(){
            return first == null;
        }

        public int getSize(){
            return size;

        }     
    }
    


