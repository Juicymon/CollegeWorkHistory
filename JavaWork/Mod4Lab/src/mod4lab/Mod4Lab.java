package mod4lab;

import java.util.Scanner;


/**
 * @author Joey Steiger
 * @Version 1.0
 * Date - 10/9/2020
 */
public class Mod4Lab {
    
    //private fields for the methods to use
    private final int MAX_SIZE = 10;
    private String[] stackItems;
    private int top;
    
    //constructor for creating the array
    public Mod4Lab(){
        stackItems = new String[MAX_SIZE];
        top = -1;
    }
    
    //method for appending item to the array
    public void push(String i){
        stackItems[++top] = i;
    }
    
    //method for returning the item at the top of the stack
    public String pop(){
        return stackItems[top--];
    }
    
    //method for determining if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }
    
    //method for determining if stack is full
    public boolean isFull(){
        return (top == MAX_SIZE - 1);
    }

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in); //scanner object
        Mod4Lab inputStack = new Mod4Lab(); //stack 
        
        System.out.println("Enter at 5 - 10 items to be placed in the stack: ");
        String input = scnr.nextLine(); //users variable input
        
        scnr = new Scanner(input); //scanner reassigned to only value of input for the proper use of ".hasNext()" method
        
        //while loop to append items to stack
        while (scnr.hasNext()){ //while there is another item in the scanner
            inputStack.push(scnr.next());
            
            if (inputStack.isFull())//breaks loop if stack is full
                break;
        }
     
        //method continues to pop and print items in the stack until it is empty. 
        while (!inputStack.isEmpty()){
            String item = inputStack.pop();
            System.out.print(item + " ");
        }
        
        
        
        
    }
    

}

