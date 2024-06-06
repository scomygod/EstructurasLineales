package Ejercicio_01_sign;
import java.util.Stack;

public class SignValidator {

    //Método para validar caracteres
    public boolean isValid(String s){
        
        Stack <Character> stack = new Stack<>(); //Pila que almacenará los caracteres

        //Bucle for que recorre cada elemento 
        for (char c : s.toCharArray()){

            //Verifica si el caracter es de apertura o de cierre 
            if (c =='(' || c == '{' || c =='[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }      
        return stack.isEmpty();
    }
    
}
