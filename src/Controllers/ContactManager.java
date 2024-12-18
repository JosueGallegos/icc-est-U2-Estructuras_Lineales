package Controllers;

import java.util.LinkedList;
import models.Contact;

//import java.util.LinkedList;

//import models.Contact;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager(){
        this.contacts = new LinkedList<>();
    }
   

    public <T> void addContact(Contact<?, ?> contact){
        
        //contacts.appendToTail(contact);
        //contact.appendToTail(contact);
        //contacts.appendToTail(contact);

    
     

    }
    public Contact<? ,? > findContactByName(String name){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        for (Contact<?, ?> contact : contacts) {
            if (((String) contact.getName()).equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
        /*NodeGeneric<Contact <?,?>> current = contacts.getHead();
        while (current != null) {
            if (((String) (current.getValue().getName())).equals(name)) {
                return current.getValue();
                
            } 
            current = current.getNext();
            System.out.println(current);
            System.out.println(current.getNext());
            
        }
        return null;// nose encontro un contacto como ese*/ 



    }
    public boolean  deleteContactByName(String name){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        for (Contact<?, ?> contact : contacts) {
            if (((String) contact.getName()).equalsIgnoreCase(name)) {
                contacts.remove(contact);
                return true; // Contact successfully deleted
            }
        }
        return false;
        /*NodeGeneric<Contact<? , ?>> current = contacts.getHead();
        if(((String) (current.getValue().getName())).equals(name)){
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize(contacts.getSize()-1);
            return;
            //Caso 1 si el contacto esta en la Head
            //
            while (current.getNext() != null) {
                if (((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)) {
                    current.setNext(current.getNext().getNext());
                    contacts.setSize(contacts.getSize());
                    return;

                    
                } 
                current = current.getNext();
                
            }

        } */


    }
    public void  printList(){
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("Contact List:");
        for (Contact<?, ?> contact : contacts) {
            System.out.println(contact);
        }
    }

    // Getter for the contacts list
    public LinkedList<Contact<?, ?>> getContacts() {
        return contacts;
    }
        


    
   
    
}


