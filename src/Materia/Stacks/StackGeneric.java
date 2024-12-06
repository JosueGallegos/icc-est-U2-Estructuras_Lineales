package Materia.Stacks;

import Materia.Models.NodeGeneric;
import java.util.EmptyStackException;

public class StackGeneric<T> {
    private NodeGeneric<T> top;
    private int size;

    public StackGeneric(){
        this.top = null;
        this.size = 0;

    }
    public void push(T data){
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top);
        top = newNode;
        size++;

    }
    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("La pila esta vacia ");
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;

    }
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();


        }
        return top.getValue();
    }
    public boolean isEmpty(){
        return  top == null;
    }
    public void printStack(){
        NodeGeneric<T> current = top;
        while (current != top) {
            System.out.println(current.getValue()+ " ");
            current= current.getNext(); 
            
        }
    }
    public int getSize(){
        int contandor = 0;
        NodeGeneric<T> current = top;
        while (current != null) {
            System.out.println(current.getValue()+ " ");
            contandor ++;
            current = current.getNext();
        }
        return contandor;
        
    }
    public NodeGeneric<T> popNode(){
        if(isEmpty()){
            throw new IllegalStateException("La pila esta vacia ");
        }
        NodeGeneric<T>  value = top;
        top = top.getNext();
        return value;


    }

   
    
}
