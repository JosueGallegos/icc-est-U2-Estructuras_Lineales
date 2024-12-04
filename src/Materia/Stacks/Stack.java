package Materia.Stacks;

import Materia.Models.Node;
import java.util.EmptyStackException;

public class Stack {

    private Node top;// Nodo en la cima de nuestra pila
    private int size;

    //Creamos la pila con la cima nula o vacia
    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;

    }
    //Metodo que retira el node de la cima
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
    //metodo que retorna el valor del node de la cima
    public int peek(){
        if(isEmpty()){
            throw  new  EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;

    }
    public void printStack(){
        Node current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
            
        }

        //System.out.println();


    }
    //Metod que retorna el tamaño de la pila
    public int getSize(){
        /*int cont = 0;
        Node current = top;

        while (current != null) {
            current = current.getNext();
            cont ++;  
        }*/
        //return cont ;
        return size;
    }

    


    
}
