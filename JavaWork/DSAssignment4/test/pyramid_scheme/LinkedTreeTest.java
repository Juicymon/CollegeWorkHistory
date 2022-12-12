package pyramid_scheme;

import DataStructures.MultiTreeNode;
import Exceptions.ElementNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Solution Test file for LinkedTree
 * 
 * @author pmele
 * @version 3/28/2019
 */
public class LinkedTreeTest {
    
    private LinkedTree<String> instance;
    private MultiTreeNode<String> root;
    private String s01;
    private String s02;
    private String s03;
    private String s04;
    private String s05;
    
    /**
     * Sets up the later tests.
     */
    @Before
    public void setUp() {
        s01 = "Elem 1";
        s02 = "Elem 2";
        s03 = "Elem 3";
        s04 = "Elem 4";
        s05 = "Elem 5";
        root = new MultiTreeNode<>(s01);
        instance = new LinkedTree<>(root);
    }

    /**
     * Test of getRootElement method, of class LinkedTree.
     */
    @Test
    public void testGetRootElement() {
        assertEquals(s01, instance.getRootElement());  
    }

    /**
     * Test of addChild method, of class LinkedTree.
     * @throws Exceptions.ElementNotFoundException
     */
    @Test
    public void testAddChild() throws ElementNotFoundException {
        assertTrue(0 == root.getNumChildren()); //root is the only element
        
        //child node correctly added
        instance.addChild(root, s02);
        assertEquals(s02, root.getChild(0).getElement());
        assertEquals(1, root.getNumChildren());
        
        
        instance.addChild(root, s03);
        instance.addChild(root, s04);
        assertEquals(3, root.getNumChildren());
        assertTrue(instance.contains(s03));
        
        //adding children to parent nodes other than root
        try {
            instance.addChild(s03, s01);
            //s03 has a child node
            assertEquals(1, instance.findNode(s03).getNumChildren()); 
             //the child node is s01
            assertEquals(s01, instance.findNode(s03).getChild(0).getElement() );
        } catch (ElementNotFoundException ex) {
            assertTrue(0 == 1); //line should never be reached
        }
        
        //exception thrown when trying to add to a parent that doesnt exist
        try {
            instance.addChild(s05, s01); //s05 doesnt exist
            assertTrue(0 == 1);
        } catch (ElementNotFoundException ex) {
            assertTrue(1 == 1); //line is reached as a result
        }
      
    }

    /**
     * Test of findNode method, of class LinkedTree.
     */
    @Test
    public void testFindNode() {
        System.out.println("testFindNode");
        try {
            //Can find root
            assertEquals(s01, instance.findNode(s01).getElement());
            instance.addChild(s01, s02);
            //System.out.println("Successfully added " + s02 + " to " + s01);
            //Can find a child node
            assertEquals(s02, instance.findNode(s02).getElement());
            instance.addChild(s01, s03); //Add several deep
            instance.addChild(s02, s04);
            instance.addChild(s04, s05);
            //Can find a child node deep within tree
            assertEquals(s05, instance.findNode(s05).getElement());
            //Trying to find things not in the tree returns null
            assertEquals(null, instance.findNode("Unreal element"));
        } catch (Exception ex) {
            fail("Unexpected Exception");
        }
    }

    /**
     * Test of contains method, of class LinkedTree.
     */
    @Test
    public void testContains() {
        assertTrue(instance.contains(s01));
        assertFalse(instance.contains(s02));
        
        instance.addChild(root, s02);
        assertTrue(instance.contains(s02));
    }

    /**
     * Test of size method, of class LinkedTree.
     */
    @Test
    public void testSize() {
        assertTrue(instance.size() == 1); //root node should make size 1
        
        //add children to root 
        instance.addChild(root, s02);
        instance.addChild(root, s03);
        instance.addChild(root, s04);
        instance.addChild(root, s01);
        
        assertTrue(instance.size() == 5); //test if size is correct
        
        //test if children of parents outside root are coutnted correctly
        try {
            instance.addChild(s01, s02);
            instance.addChild(s01, s03);
            assertTrue(instance.size() == 7);
        } catch (ElementNotFoundException ex) {
            assertTrue(0 == 1);
        }
        
    }
    
}
