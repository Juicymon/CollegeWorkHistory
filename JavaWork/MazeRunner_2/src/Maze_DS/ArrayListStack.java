package Maze_DS;


import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;

/**
 *Implementation of a stack using an ArrayList
 * @author Joey Steiger
 * @param <T> type of the object chosen at instantiation 
 */
public class ArrayListStack<T> implements StackADT<T> {

    int numOfElements = 0;
    private ArrayList<T> stack;
   
    /**
     * Default constructor of ArrayListStack object.
     */
    public ArrayListStack(){
        stack = new ArrayList<>();
    }
    
    /**
     * method to add new element to the end of the list
     * 
     * @param element the element to be added
     */
    @Override
    public void push(T element) {
        stack.add(element); //adds the item to the end of the ArrayList
        numOfElements++;
    }

    /**
     * method to remove and return the value of the item at the end of the 
     * array. 
     * 
     * @return the value found at the last index of the ArrayList
     * @throws EmptyCollectionException if the ArrayList is empty
     */
    @Override
    public T pop() throws EmptyCollectionException {
        if(!stack.isEmpty()){ //ensures the arraylist has a value to pop
            T temp = stack.get(numOfElements - 1); //holds the value of the pop
            stack.remove(numOfElements - 1); //
            numOfElements--; //decrements counter
            return temp; 
        }
        else {
            throw new EmptyCollectionException("ECE - pop");
        }
    }
    
    /**
     * method to see what the last element in the ArrayList is without removing
     * it.
     * 
     * @return the element last element in the ArrayList
     * @throws EmptyCollectionException if the ArrayList is empty
     */
    @Override
    public T peek() throws EmptyCollectionException {
        if(!stack.isEmpty()){ //ensuring stack has value
            return stack.get(numOfElements - 1); //returns the last item 
        }
        else{
            throw new EmptyCollectionException("ECE - peek");
        }
    }
    
    /**
     * method to check if the ArrayList is empty
     * 
     * @return true if and only if the ArrayList is empty
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty(); //uses the ArrayList isEmpty method
    }
    
    /**
     * method checks the size of the ArrayList
     * 
     * @return integer value of the size of the ArrayList
     */
    @Override
    public int size() {
        return stack.size();//uses ArrayList size method
    }
    
    /**
     * method to print the ArrayList to string
     * 
     * @return string of the ArrayList
     */
    @Override
    public String toString() {
        return "ArrayListStack{" + "numOfElements=" + numOfElements + ", stack=" + stack + '}';
    }
    
}
