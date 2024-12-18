package models;

import Materia.Models.NodeGeneric;

//import Materia.Models.Node;
//import org.w3c.dom.Node;

public class LinkedList <T>{
    private NodeGeneric<T> head;
    private int size = 0 ;


    public LinkedList(NodeGeneric<T> head, int size) {
        this.head = head;
        this.size = size;
    }

    public void appendToTail(T value){
        if (head == null) {
            head = new NodeGeneric<>(value);
            
        }else{
            NodeGeneric<T> current= head;
            while (current.getNext() != null) {
                current = current.getNext();
                
            }
            current.setNext(new NodeGeneric<>(value));
        }
        size++;
        
    }

    public void print(){
        if(head == null){
            System.out.println("END");
            return;
        }
        NodeGeneric<T> current = head;
        while (current.getNext() != null) {
            System.out.println(current.getValue()+ " -->"); 
            current = current.getNext();
            
        }
        System.out.println("End");
    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }

    public int getSize(int size) {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "LinkedList [head=" + head + ", size=" + size + "]";
    }
    

}
