package Exceptions;

/**
 * An Empty Collection Exception class
 * Prints out what type of collection is empty
 * For use in ITCS 2214 Data Structures & Algorithms
 * UNC Charlotte, 2016
 * @author clatulip
 */
public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String collection) {
        super("The " + collection);
    }
    
}
