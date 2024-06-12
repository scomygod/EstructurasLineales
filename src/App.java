import java.util.Stack;

import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Ejercicio_03_linkedLists.LinkedListEjr;
import Materia.Cola.Cola;
import Materia.Cola.ColaGenerica;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado ed la fila es: " + pila.pop());
        System.out.println();

        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantalla("Home Page", "/home"));
        pilaPantallas.push(new Pantalla("Menu Page", "/home/menu"));
        pilaPantallas.push(new Pantalla("Settings Page", "home/menu/settings"));

        System.out.println("Estoy en la pantalla:\n\t" + pilaPantallas.peek().getNombre());
        System.out.println("Destruir la pantalla:\n\t" + pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t" + pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla:\n\t " + pilaPantallas.peek().getNombre());

        // Implementación de la Cola
        Cola queue = new Materia.Cola.Cola();
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);

        // Elemento en el frente
        System.out.println("Elemento en el frente: " + queue.peek());

        // Retirar elementos de la cola
        System.out.println("Elemento retirado: " + queue.remove());
        System.out.println("Elemento en el frente: " + queue.peek());

        System.out.println("Elemento retirado: " + queue.remove()); // Retirar
        System.out.println("Elemento en el frente: " + queue.peek());

        // Verificar si la cola está vacía
        System.out.println("¿Cola vacía?" + (queue.isEmpty() ? " Sí" : " No"));

        // Imprementación de la Cola Genérica Tipo Pantalla

        ColaGenerica<Pantalla> queueGenerica = new ColaGenerica<>();
        queueGenerica.addNode(new Pantalla("Home Page", "/home"));
        System.out.println("Tamaño después de agregar: " + queueGenerica.getSize());
        queueGenerica.addNode(new Pantalla("Menu Page", "/home/menu"));
        System.out.println("Tamaño después de agregar: " + queueGenerica.getSize());
        queueGenerica.addNode(new Pantalla("Settings", "home/menu/settings"));
        System.out.println("Tamaño después de agregar: " + queueGenerica.getSize());

        System.out.println("Estoy en la pantalla:\t" + queueGenerica.peek().getNombre());

        System.out.println("Pantalla destruida:\t" + queueGenerica.remove().getNombre());
        System.out.println("Tamaño después de eliminar: " + queueGenerica.getSize());

        queueGenerica.addNode(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Tamaño después de agregar: " + queueGenerica.getSize());

        System.out.println("Estoy en la pantalla:\t" + queueGenerica.peek().getNombre());
        System.out.println("Pantalla destruida:\t" + queueGenerica.remove().getNombre());
        System.out.println("Tamaño después de eliminar: " + queueGenerica.getSize());
        System.out.println("Pantalla destruida:\t" + queueGenerica.remove().getNombre());
        System.out.println("Tamaño después de eliminar: " + queueGenerica.getSize());
        System.out.println("Estoy en la pantalla:\t" + queueGenerica.peek().getNombre());
        System.out.println("Tamaño: " + queueGenerica.getSize());

        // Output Valiación
        SignValidator validator = new SignValidator();
        System.out.println(validator.isValid("([]){}")); // True
        System.out.println(validator.isValid("({)}")); // False

        // Output Ordenamiento
        StackSorter sorter = new StackSorter();

        // Nuevo stack
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        // Muestra el stack original, lo ordena, y muestra el stack ordenado
        System.out.println("Stack original: " + stack);
        sorter.sortStack(stack);
        System.out.println("Stack ordenado: " + stack);

        ListaEnlazada lista = new ListaEnlazada();
        lista.addNode(1);
        lista.addNode(4);
        lista.addNode(3);
        lista.addNode(6);

        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(3);
        lista.print();

        // LinkedList
        LinkedListEjr linkedList = new LinkedListEjr();

        // Agregar elementos a la lista
        linkedList.push(6);
        linkedList.push(7);
        linkedList.push(5);
        linkedList.push(2);
        linkedList.push(1);

        //Imprime solo una posición de la lista
        /*
         * Posición a buscar
         * int posicion = 1;
         * System.out.println("Posición a buscar: " + posicion);
         * 
         * // Obtener el valor en la posición indicada
         * int valor = linkedList.getByPos(posicion);
         * System.out.println("Return: " + valor);
         */

        // Imprimir la lista
        System.out.println("Lista Enlazada con los datos:");
        linkedList.printList();

        // Imprimir todas ls posiciones
        for (int posicion = 0; posicion < linkedList.size(); posicion++) {
            // Obtener el valor en la posición indicada
            int valor = linkedList.getByPos(posicion);
            System.out.println("Posición: " + posicion + " | Valor: " + valor);
        }
    }
}
