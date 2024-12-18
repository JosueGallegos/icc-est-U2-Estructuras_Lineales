package Materia.Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {
    public static void Ordenar(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop(); 
            while (!temp.isEmpty()&& temp.peek() < current) {
                stack.push(temp.pop());

                
            }
            temp.push(current);
            
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop()); 
            
        }

    }

    
}
