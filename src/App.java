
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //runStack();
        //printStack();
        runStackGeneric();

        
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
    public static void runStackGeneric(){
        StackGeneric<Pantalla> router= new StackGeneric<>();
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        System.out.println("Regreso a " + ((router.popNode().getNext().getValue())).getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());

        router.push(new Pantalla(1, "Page", "/home/menu/settihgs"));

        System.out.println("Pantalla = " +router.getSize());
        System.out.println("Estoy en "+ router.peek().getRuta());
        router.printStack();
        
         
    }
}
