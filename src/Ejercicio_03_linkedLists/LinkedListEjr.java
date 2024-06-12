package Ejercicio_03_linkedLists;

import Materia.Models.*;

public class LinkedListEjr {
    private Node head;

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Método
    public int getByPos(int posicion) {
        Node current = head;

        //Bucle for para recorrer la lista
        for (int i = size() - 1; i > posicion; i--) {
            current = current.next;

            if (current == null) {
                return -1;
            }
        }

        //Devolver el valor del nodo
        return current.value;
    }

    // Método para obtener el tamaño
    public int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Método para imprimir la lista enlazada
    public void printList() {
        Node temp = head;

        // Bucle 'while' que recorre la lista y mostrar cada nodo
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
