/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joey Steiger
 */
public class ArrayListStackTest {
    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        Object element = null;
        ArrayListStack instance = new ArrayListStack();
        
        assertTrue(instance.size() == 0);
        
        try{
            instance.push(element);
            assertTrue(instance.peek() == element);
            assertTrue(instance.size() == 1);   
        }
        catch (Exception e){
            assertTrue(0 == 1);
        }  
    }

    /**
     * Test of pop method, of class ArrayListStack.
     * @throws EmptyCollectionException
     */
    @Test
    public void testPop() throws Exception { 
        ArrayListStack instance = new ArrayListStack();
        Object expResult = null;
        
        //test for pop when there is a value in the stack
        //also tests decrementing size and if the value is correct
        try {  
            instance.push(expResult);
            assertTrue(instance.size() == 1);
            
            Object result = instance.pop();
            assertTrue(instance.size() == 0);
            assertEquals(expResult, result);  
        } 
        catch (EmptyCollectionException e) {
            assertTrue(0 == 1);
        }
        
        
        //test for trying to use pop when the stack is empty
        try {
            instance.pop();
            assertTrue(0 == 1);
            
        } catch (EmptyCollectionException e) {
            assertTrue(1 == 1);
        }
        
        
    }

    /**
     * Test of peek method, of class ArrayListStack.
     * @throws java.lang.Exception
     */
    @Test
    public void testPeek() throws Exception { 
        ArrayListStack instance = new ArrayListStack();
        Object expResult = null;
        
        assertEquals(0, instance.size());
        
        //trying to peek an empty collection
        try {
            instance.peek(); //peek called on empty stack should throw error
            assertTrue(0 == 1);//line should never be reached
        } catch (EmptyCollectionException e) {
            assertTrue(1 == 1); //testing if expection is thrown
        }
        
        //trying to peek a non-empty collection. 
        try {
            instance.push(expResult);
            assertEquals(1, instance.size());
            
            Object result = instance.peek();
            assertEquals(expResult, result); //values should be equal
            
            assertEquals(1, instance.size()); //shows size doesn't change
            
        } catch (EmptyCollectionException e) {
            assertTrue(0 == 1);
        }
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        ArrayListStack instance = new ArrayListStack();
        Object generic = null;
        
        //testing isEmpty on an empty case
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
       
        //testing isEmpty on a non-empty case
        expResult = false;
        instance.push(generic);
        result = instance.isEmpty();
        assertEquals(expResult, result);
       
            
       
        
       
        
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        ArrayListStack instance = new ArrayListStack();
        Object generic = null;
        
        //test that there is nothing in the stack
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
        //test that adding to the collection increases size
        instance.push(generic);
        expResult = 1;
        result = instance.size();
        assertEquals(expResult, result);
        instance.push(generic);
        expResult = 2;
        result = instance.size();
        assertEquals(expResult, result);
        
        
        //tests taht removing fromt the collection decreases size
        try {
            instance.pop();
            expResult = 1;
            result = instance.size();
            assertEquals(expResult, result);
            instance.pop();
            expResult = 0;
            result = instance.size();
            assertEquals(expResult, result);          
        } 
        catch (EmptyCollectionException e) {
            assertTrue(0 == 1);
        }
        
    }
    
}
