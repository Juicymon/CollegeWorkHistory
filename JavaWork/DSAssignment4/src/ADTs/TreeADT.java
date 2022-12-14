package ADTs;

import Exceptions.EmptyCollectionException;

/**
 * An interface for a Tree
 * Specific tree implementations will implement this interface
 * For use in ITCS 2214 Data Structures & Algorithms
 * UNC Charlotte, 2019
 * @author pmele
 * @param <T>
 */
public interface TreeADT<T> {
    /**
     * Returns the element at the root 
     * @return the element at the root
     * @throws EmptyCollectionException 
     */
    public T getRootElement() throws EmptyCollectionException;
    
    /**
     * checks to see if element is in tree
     * @param targetElement, the element we are looking for
     * @return boolean, true if found, false otherwise
     */
    public boolean contains(T targetElement);
    
    /**
     * Returns the size of the tree
     * @return the size of the tree
     */
    public int size();
}
