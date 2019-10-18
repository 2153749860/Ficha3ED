/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;


/**
 *
 * @author tiago
 */
public class LinkedStack<T> implements StackADT<T> {
    
    private int count;
    private LinearNode<T> head;

    public LinkedStack() {
        this.count = 0;
        this.head = null;
    }

    @Override
    public void push(T element) {
        LinearNode newNode = new LinearNode(element);
        if(this.count == 0){
            this.head = newNode;
            this.count++;
        }
        else{
            newNode.setNext(this.head);
            this.head = newNode;
            this.count++;
        }
    }

    @Override
    public T pop() throws EmptyCollectionException2 {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T peek() throws EmptyCollectionException2 {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        LinearNode<T> current = this.head;
        StringBuilder str = new StringBuilder();
        str.append("Head: ");str.append(this.head.getElement());str.append("\n");
        str.append("Tamanho: ");str.append(this.count);str.append("\n");
        

        while (current != null) {
            str.append(current.getElement());
            str.append("\n");
            current = current.getNext();
        }
        return str.toString();
    }
    
    
    
}
