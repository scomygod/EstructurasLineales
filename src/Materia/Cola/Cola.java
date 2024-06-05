package Materia.Cola;
import java.util.NoSuchElementException;

import Materia.Models.Node;

public class Cola {

    private Node first;
    private Node last;

    public Cola (){
        this.first = null;
        this.last = null;
    }

    //Método para agregar un Node a la cola
    public void addNode (int value){
        Node nuevoNodo = new Node(value);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
    }

    //Método para quitar
    public int remove (){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía. "); 
        }
        int value = first.value;
        first = first.next;
        if (first==null) {
            last = null;   
        }
        return value;
    }

    //Método para obtener y no sacar
    public int peek(){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía. ");
        }
        return first.value;
    }

    //Método para verificar si está vacía
    public boolean isEmpty(){
        return first == null;
    }
    
}
