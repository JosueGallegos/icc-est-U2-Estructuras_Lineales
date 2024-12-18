
import Materia.Ejercicio_01_sign.SingValidator;
import Materia.Ejercicio_02_sorting.StackSorter;
import Materia.Queues.Queque;
import Materia.Queues.QuequeGeneric;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        //runStackGeneric();
        //runQueue();
        //runQuequeGeneric();
        //runContactManager();
        runEjercicios();
    }

    public static void runStack(){
        //instanciar la clase
        Stack stack = new Stack();

        //agregar elementos a la pila.
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        //mostrar los valores
        System.out.println("Cima    -> "+stack.peek());
        System.out.println("Retirar    -> "+stack.pop());
        System.out.println("Cima    -> "+stack.peek());
        System.out.println("Retirar    -> "+stack.pop());
        System.out.println("Cima    -> "+stack.peek());

        //mostrar el tamaño
        System.out.println("Tamaño: "+stack.getSize());
    }

    public static void runStackGeneric(){
        //instanciar la clase
        StackGeneric<Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1,"Home Page","/home"));
        router.push(new Pantalla(1,"Menu Page","/home/menu"));
        router.push(new Pantalla(1,"Users Page","/home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        //System.out.println("Regreso a "+router.pop().getRuta());
        System.out.println("Regreso a "+(router.popNode().getNext().getValue()).getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());

        router.push(new Pantalla(1,"Settings Page","/home/menu/settings"));

        System.out.println("\nPantallas = "+router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());
        router.printStack();
    }

    public static void runQueue(){
        Queque colas = new Queque();
        colas.enqueue(10);
        colas.enqueue(20);
        colas.enqueue(30);
        colas.enqueue(40);

        System.out.println(colas.peek());
        System.out.println(colas.dequeque());
        System.out.println(colas.dequeque());
        System.out.println(colas.peek());
    }

    public static void runQuequeGeneric(){
        QuequeGeneric<Integer> cola = new QuequeGeneric<>();

        
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

      
        System.out.println(cola.peek().getValue());
        System.out.println(cola.deQueque().getNext().getValue());
        System.out.println(cola.peek().getValue());

        cola.enqueue(40);
        
        System.out.println("\nTamaño : "+cola.getSize());
        cola.printQueuqe();
        
        
    }
    /*private static void runContactManager(){
        MenuController menuController = new MenuController();
        menuController.showMenu();

    }*/

    public static void runEjercicios(){
        System.out.println("Ejercicio 1. ");
        String input1 = "([]){}";
        String input2 = "({)}";
        System.out.println("Input: " +input1 +" -> "+ SingValidator.isValid(input1));
        System.out.println("Input: " + input2+" -> " + SingValidator.isValid(input2));

        System.out.println("\nEjercicio 2. ");
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Input: "+ stack);
        StackSorter.Ordenar(stack);
        System.out.println("Output: " + stack);

    }
}