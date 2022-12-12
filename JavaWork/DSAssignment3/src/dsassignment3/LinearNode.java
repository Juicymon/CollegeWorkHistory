/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment3;

/**
 *
 * @author clatulip
 */
public class LinearNode<T> {
    private LinearNode<T> next;
    private T element;

    /**
     * Default constructor creates an empty node
     */
    public LinearNode() {
        next = null;
        element = null;
    }

    /** 
     * Creates a node containing element
     * @param elem element to be stored
     */
    public LinearNode(T elem) {
        next = null;
        element = elem;
    }
    
    /**
     * Gets the node that follows this one 
     * @return next linear node
     */
    public LinearNode<T> getNext()
    {
        return next;
    }
    
    /**
     * Sets the node that follows this one
     * @param n LinearNode to follow this one
     */
    public void setNext(LinearNode<T> n) {
        next = n;
    }
    
    /**
     * Returns the element stored in this node
     * @return element stored in the node
     */
    public T getElement() {
        return element;
    }
    
    public void setElement(T elem) {
        element = elem;
    }

    @Override
    public String toString() {
        return "{el=" + element + ", next=" + next + "}";
    }
    
    
    
}
