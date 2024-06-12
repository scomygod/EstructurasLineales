package Materia.ListasEnlazadas;
import Materia.Models.Node;

public class ListaEnlazada {
    public Node head;
    public ListaEnlazada(){
    }

    //Método para agregar Nodos a la lista
    public void addNode (int value){
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;          
        }
        current.next = new Node(value);
    }

    //Método para eliminar datos de la lista
    public void deleteNode (int value){
        if (head == null)  return; //Si la lista está vacía, no haga nada
            
        if (head.value == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    public int size (){
        return 1;
    }

    //Método para imprimir
    public void print(){
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.println("Node -> "+ current.value);
            current = current.next;
            }
        System.out.println("Node -> "+ current.value);
        System.out.println("Fin de la lista.");
    }

}
