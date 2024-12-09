package Materia.Queues;

import Materia.Models.Node;
import java.util.NoSuchElementException;

public class Queque {
    private Node front; //nodo al frente de la cola
    private Node rear; //nodo al final de la cola

    //creamos una cola con nodos vacios
    public Queque() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    //desencolar
    public Node dequeque(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node node = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        return node;
    }

    public Node peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public int getSize(){
        int contador = 0;
        Node rear = front;
        while(rear != null){
            System.out.print(rear.getValue() + " ");
            contador++;
            rear = rear.getNext();
        }
        return contador;
    }

    public void printQueuqe(){
        Node rear = front;
        while(rear != null){
            System.out.print(rear.getValue() + " ");
            rear = rear.getNext();
        }
    }

    
}
