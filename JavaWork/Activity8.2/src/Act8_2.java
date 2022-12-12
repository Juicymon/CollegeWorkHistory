
/**
* @author: Joseph Steiger
* @date: 6/19/2020
* @description: Activity 8.2
* 
*/
import java.util.Scanner;
public class Act8_2 {
static String[] shoppingList ;


public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
shoppingList = new String[5]; // part A


for (int i = 0; i<shoppingList.length;i++){
System.out.print("Input an item to your shopping list: ");
shoppingList[i]=sc.next();
}

/*
 * Part A Questions
 * 1) null
 * 2) once corrected, the output will be the 5 items in the array
 * 3) the .length() method is incorrect for an array - syntax error
 * 4) i's scope is to that of the for loop, shopping list has a global scope however. 
 */
for (int i =0; i<shoppingList.length;i++){
System.out.print(shoppingList[i]+" ");

}
System.out.println();


/*
 * 
 * Part B questions
 * 1) It will output the length of the string at the given index
 * 2) no errors
 */

for (int i =0; i<shoppingList.length;i++){
System.out.print(shoppingList[i].length()+" ");

}
System.out.println();




shoppingList[0]="shampoo"; 

System.out.println("Making a new variable with same name:");
String [] shoppingList= {"chips","coke","milk","cheese","notebook"};

/* 
 * Part C Questions
 * 1) the output will be the new shopping list
 * 2) no errors
 * 3) i is a local variable to the for loop, shopping list is local to the main method
 */
int i=0;
for (i =0; i<shoppingList.length;i++){
System.out.print(shoppingList[i]+" ");
}
System.out.println("\n array length is "+i);



/*
 * Part D Question
 * 1) It will output the global variable shopping list, but with shampoo as the first word
 * 2) no errors
 * 3) i is local to the for loop in the myMethod method, shoppingList is global
 * 
 */
myMethod();


}


public static void myMethod() {
for (int i =0; i<shoppingList.length;i++){
System.out.print(shoppingList[i]+" "); 
}
}


}


