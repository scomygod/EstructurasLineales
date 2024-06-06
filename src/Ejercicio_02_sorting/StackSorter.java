package Ejercicio_02_sorting;
import java.util.Stack;
public class StackSorter {

    //Método para ordenar un stack
    public void sortStack (Stack<Integer> stack){
        Stack<Integer> stack1 = new Stack<>(); //Pila que almacenará los números

        //Bucle while, mientras el stack original no esté vacío 
        while (!stack.isEmpty()) {
            int temp = stack.pop(); //temp es el elemento superior del stack 

            //Bucle while, mientras el stack temporal '1' no esté vacío y el elemento superior no sea mayor que 'temp'
            while (!stack1.isEmpty() && stack1.peek() > temp){
                stack.push(stack1.pop());
            }
            //Insertamos el elemento
            stack1.push(temp);      
        }
        //Mientras el stack temporal no esté vacío, movemos los elementos
        while (!stack1.isEmpty()) {
            stack.push(stack1.pop());
        }

    }
    
}
