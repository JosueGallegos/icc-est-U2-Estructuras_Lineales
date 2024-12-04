
import Materia.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        runStack();
    }
    public static void runStack(){
        //Intanciar la clase 
        Stack stack = new Stack();

        //Agregamos elementos a la pila
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);
        //Mostrar valores

        System.out.println("Cima    -> "+ stack.peek());
        System.out.println("Retirar -> "+ stack.pop());
        System.out.println("Cima    -> "+ stack.peek());
        System.out.println("Retirar -> "+ stack.pop());
        System.out.println("Cima    -> "+ stack.peek());
        //System.out.println("Retirar -> "+ stack.pop());


    }
}
