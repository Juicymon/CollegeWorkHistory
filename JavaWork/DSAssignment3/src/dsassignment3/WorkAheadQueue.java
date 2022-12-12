
package dsassignment3;
import java.util.ArrayList;


/**
 *
 * @author Joseph Steiger
 * @param <T>
 */
public class WorkAheadQueue<T> implements WorkAheadQueueADT<T> {
    
    protected LinearNode<T> front;
    protected LinearNode<T> back;
    protected ArrayList<LinearNode<T>> frontThreeNodes;
    protected ArrayList<T> frontThreeElements;
    protected int numNodes;
    protected ArrayList<LinearNode<T>> theQueue;

    //default constructor for WorkAheadQueue object
    public WorkAheadQueue(){
        numNodes = 0;
        front = null;
        back = null;
        frontThreeElements = new ArrayList<>();
        frontThreeNodes = new ArrayList<>();
        theQueue = new ArrayList<>();
    }
    
    /**
     * Method utilized to add an item to the end of the queue
     * 
     * @param element is an element of type T passed into the method to 
     * add to the queue
    */
    @Override
    public void enqueue(T element) {
        theQueue.add(new LinearNode<>(element)); //add item to end of queue
        numNodes++; //increase counter
        
        //if node being added is the first item in the queue, make it 
        //front and back
        if(numNodes == 1){
            front = theQueue.get(0);
            back = theQueue.get(0);
        }
        else{ //if not first node, just update back node
            back = theQueue.get(numNodes - 1);
        }
        
        /*if not first node being added, update the next pointer for 
        *previous node
        */
        if (numNodes > 1){
            theQueue.get(numNodes - 2).setNext(theQueue.get(numNodes - 1));
        }
        
        /**
         * if first three nodes not full, add new item to first three nodes and
         * elements
         */
        if (numNodes <= 3){ 
            frontThreeNodes.add(new LinearNode<>(element));
            frontThreeElements.add(element);
        }     
          
    }
    
    /**
     * Method utilized to remove one of the first 3 nodes (user choice) of the
     * queue 
     * 
     * @param x is an integer value that must be less than 3; it represents the index of 
     * the item being removed
     * @return the element being held in the chosen node being removed
     * @throws EmptyCollectionException if collection is empty 
     * @throws InvalidArgumentException if value is invalid choice
     */
    @Override
    public T dequeue(int x) throws EmptyCollectionException, InvalidArgumentException { 
        
        //check to ensure index being accessed is accessable
        if (x > 2 || (x > numNodes - 1 && !theQueue.isEmpty()) || x < 0){
            throw new InvalidArgumentException("dequeue");
        }
        else if (theQueue.isEmpty()){
            throw new EmptyCollectionException("dequeue");
        }
        
        //removes the value from the queue, frontThreeElements, and front nodes
        LinearNode<T> returnTemp = theQueue.remove(x);
        frontThreeElements.remove(x);
        frontThreeNodes.remove(x);
        numNodes--;
        
        /**
         * if there are at least 3 nodes left, fTE and fTN need to be updated,
         * the node/element in index 2 fills the empty space in fTN and fTE
         */
        if (numNodes >= 3){
            frontThreeElements.add(theQueue.get(2).getElement());
            frontThreeNodes.add(theQueue.get(2));
            
            //if index 1 or 2 was removed, the next pointed needs to be updated
            if (x != 0){
                theQueue.get(x - 1).setNext(theQueue.get(x));
            }
        }
        /**
         * if only two nodes are left and the middle index was removed before,
         * this ensures the pointer is updated correctly
         */
        else if(numNodes == 2 && x ==1){ 
            theQueue.get(x - 1).setNext(theQueue.get(x));
        }
        
        //if first elements was removed, update front pointer. 
        if (x == 0 && !(theQueue.isEmpty())){ 
            front = theQueue.get(0);
        }
                
       return returnTemp.getElement();
    }//end dequeue

    /**
     * Method to see the value being held in one of the first 3 nodes
     * 
     * @param x is the index trying to be accessed
     * @return the value of the element being held in the chosen node
     * @throws EmptyCollectionException if collection is empty
     * @throws InvalidArgumentException if value is invalid option
     */
    @Override
    public T first(int x) throws EmptyCollectionException, InvalidArgumentException {
        //checks validity of input
        if (x > 2 || (x > numNodes - 1 && !theQueue.isEmpty()) || x < 0){
            throw new InvalidArgumentException("first");
        }
        else if (theQueue.isEmpty()){
            throw new EmptyCollectionException("first");
        }
        
        LinearNode<T> temp = theQueue.get(x);
        
        return temp.getElement();       
    }//end first

    /**
     * Method to view the first three nodes in the queue
     * 
     * @return an array of the first three nodes in the queue
     * @throws EmptyCollectionException if queue is empty. 
     */
    @Override
    public ArrayList<LinearNode<T>> firstThreeNodes() throws EmptyCollectionException { // don't populate until the method is called?
        if (this.numNodes == 0){
            throw new EmptyCollectionException("firstThreeNodes");
        }
        
        return frontThreeNodes;
    }//end firstThreeNodes
    
    /**
     * Method to view the elements being held in the first three nodes
     * 
     * @return an array of the first three elements in the queue
     * @throws EmptyCollectionException if collection is empty
     */
    @Override
    public ArrayList<T> firstThreeElements() throws EmptyCollectionException { //call firstThreeNodes to ensure populated corretly, then assign values
        
        if (this.numNodes == 0){
            throw new EmptyCollectionException("queue");
        }
    
        return frontThreeElements;
    }//end firstThreeElements
    
    /**
     * Checks if the queue is empty
     * 
     * @return true if the queue is empty
     */
    @Override
    public boolean isEmpty(){
        return (this.numNodes == 0);
    }// end isempty
    
    /**
     * Checks the current size of the queue
     * 
     * @return the current queue size based on how many nodes are in it
     */
    @Override
    public int size() {
        return this.numNodes;
    }//end size
    
    /**
     * Prints the contents of the queue (prints nodes, not elements)
     * 
     * @return each node and its next node in print 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        LinearNode curr = front;
        
        for (int i = 0; i < size(); i++){
            sb.append(curr.getElement().toString());
            if (i < size() - 1){
                sb.append(", ");
            }
            curr = curr.getNext();
        }
        return sb.toString();
    }//end tostring
    
    /**
     * Method returns the first item in the queue
     * 
     * @return the first node in the queue
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public T first() throws EmptyCollectionException{
        
        if (theQueue.isEmpty()){
            throw new EmptyCollectionException("first");
        }
        LinearNode<T> first = theQueue.get(0);
        
        return first.getElement();
    }//end first
    
    /**
     * Method to remove the first item in the queue
     * 
     * @return the first item in the queue
     * @throws EmptyCollectionException if the queue is empty
     */
    @Override
    public T dequeue() throws EmptyCollectionException {
        if(theQueue.isEmpty())
            throw new EmptyCollectionException("dequeue");
        try {
            return dequeue(0);
        } catch (InvalidArgumentException ex) {
            System.out.print("Dequeue - IAE");
        }
        
        return null;
    }//end dequeue
    
}//end class
