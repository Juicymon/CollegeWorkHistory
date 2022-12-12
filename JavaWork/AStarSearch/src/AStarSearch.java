import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/*
 * Joseph Steiger
 * 3/22/2022
 * 
 * A simple A* searching algorithm that takes user inputed starting and end nodes
 * determines the best path between them, and prints it.
 */
public class AStarSearch {

	public static void main(String[] args) {
		
		//variable declarations
		char board[][] = new char[15][15]; 
		int startX=0, startY=0, endX=0, endY=0;
		PriorityQueue<Node> openList = new PriorityQueue<Node>();
		ArrayList<Node> closedList = new ArrayList<>();
		Scanner userInput = new Scanner(System.in);
		boolean userIsDone = false;
		
		//main part of the program, loops until user is done playing
		while(!userIsDone) {
			boolean validInput = false; //checks input before moving on
			createBoard(board); //calls board creation method
			printBoard(board); //calls board printing method
			System.out.println(); //blank line for spacing
			
			//loop to ensure user is picking valid start node
			while(!validInput) {
				System.out.println("Enter the Row and Column location of your starting Node (values between 1 and 15):");
				startX = userInput.nextInt() - 1;
				startY = userInput.nextInt() - 1;
				if (startX < 0 || startX > 14 || startY < 0 || startY > 14) {
					System.out.println("Please enter valid input values for the start node.");
				}
				else {
					if ( board[startX][startY] == '-') {
						System.out.println("This space is occupied by a blockade. Please try another starter node.");
					}
					else {
						board[startX][startY] = 'S';
						validInput = true;
					}
				}
			}//end while
			
			//loop to ensure user is picking valid end node
			validInput = false;
			while (!validInput) {
				System.out.println("Enter the Row and Column location of your ending node (values between 1 and 15):");
				endX = userInput.nextInt() - 1;
				endY = userInput.nextInt() - 1;
				if (endX < 0 || endX > 14 || endY < 0 || endY > 14) {
					System.out.println("Please enter valid input values for the end node.");
				}
				else {
					if (board[endX][endY] == '-') {
						System.out.println("This space is occupied by a blockade. Please try another end node.");
					}
					else {
						board[endX][endY] = 'E';
						validInput = true;
					}
				}
			}//end while
			
			printBoard(board);
			int heuristicStart = calcHeuristic(startX, startY, endX, endY); 
			
			//creation of end and starter node for passing to methods
			Node end = new Node(endX, endY);
			Node starterNode = new Node(startX, startY);
			starterNode.setG(0);
			starterNode.setH(heuristicStart);
			starterNode.setF();
			openList.add(starterNode);
			
			//creates a current node to track location in board
			//takes item off the top of the heap (queue)
			Node currentNode = openList.poll();
			closedList.add(currentNode);
			
			boolean endFound = false;
			boolean noPath = false;
			
			//loop to continue generating neighbors and popping items from open queue until
			//end is found
			while(!endFound) {
				if (currentNode.equals(end)) {
					endFound = true;
				}
				else {
					generateNeighbors(board, openList, closedList, currentNode, endX, endY);
					if(openList.peek() != null) { //if next item is not null, pop the new current and add it to closed list
						currentNode = openList.poll();
						closedList.add(currentNode);
					}
					else { //if openList is empty and end is not found, there is no path to it 
						System.out.println("No path could be found. Nothing to display.");
						noPath = true;
						endFound = true;
					}
				}
			}//end loop
				
			if (noPath == false) { //if there is a path
				Node lastNode = closedList.get(closedList.size()-1); //gets the endNode from the closed list
				//while loop to step through each node parent-to-parent to generate the path from start to end
				while(lastNode.getParent() != null) { //if the current node is not the start or end node, put a path icon
					if (!lastNode.equals(end)) {
						board[lastNode.getRow()][lastNode.getCol()] = '*';
					}
					else { //if the current node is the end node, leave the E
						board[lastNode.getRow()][lastNode.getCol()] = 'E';
					}
					lastNode = lastNode.getParent(); //move to next node
				}
				
				System.out.println("\n*****Best Path Found*****");
				printBoard(board); //prints path
			}//end if
				
				openList.clear();
				closedList.clear();
				validInput = false;
				char playAgain;
				
				//determines if user wants to play again
				while(!validInput) {
					System.out.println("Would you like to run another board? (Y/N):");
					playAgain = userInput.next().charAt(0);
					
					if (playAgain == 'Y' || playAgain == 'y') {
						userIsDone = false;
						validInput = true;
					}
					else if (playAgain == 'n' || playAgain == 'N') {
						userIsDone = true;
						validInput = true;
					}
					else
						System.out.println("Please enter a valid option.");
				}
				
		}//end program
		System.out.println("\nProgram Terminated");
		userInput.close();
	}//end main
	
	
	//method for creating the board by using two for loops, each node has 10% chance to be blocker
	public static void createBoard(char[][] gameBoard){
		int rNum; 
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				rNum = ThreadLocalRandom.current().nextInt(0, 10);//rolling 10% chance
				if (rNum == 4) 
					gameBoard[i][j] = '-';
				else
				gameBoard[i][j] = '0';
			}
		}
	}//end createBoard
	
	//method for print the game board witha loop
	public static void printBoard(char[][] gameBoard) {
		
		System.out.println("-------   GAME BOARD   -------");
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(gameBoard[i][j] + " ");
			}
			System.out.println();
		}
	}//end printBoard
	
	/*
	 * method for generating neighbors
	 * Uses a switch statement to check nodes from top left  to the bottom right of the node being passed in for 
	 * generating the neighbors
	 * Uses the generateNode method for each node in its 8 attempts
	 */
	public static void generateNeighbors(char[][] gameBoard, PriorityQueue<Node> oList, ArrayList<Node> cList, Node current, int endX, int endY) {
		int nodeX, nodeY;
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0: //top left
				nodeX = current.getRow() - 1;
				nodeY = current.getCol() - 1;
				generateNode(nodeX, nodeY, gameBoard, cList, oList, endX, endY, current, i);
				break;
			case 1: //top middle
				nodeX = current.getRow() -1;
				nodeY = current.getCol();
				generateNode(nodeX, nodeY, gameBoard, cList, oList, endX, endY, current, i);
				break;
			case 2: //top right
				nodeX = current.getRow() -1;
				nodeY = current.getCol() + 1;
				generateNode(nodeX, nodeY, gameBoard, cList, oList, endX, endY, current, i);
				break;				
			case 3: //middle left
				nodeX = current.getRow();
				nodeY = current.getCol() - 1;
				generateNode(nodeX, nodeY, gameBoard, cList, oList, endX, endY, current, i);
				break;
			case 4: //middle right
				nodeX = current.getRow();
				nodeY = current.getCol() + 1;
				generateNode(nodeX, nodeY, gameBoard, cList, oList, endX, endY, current, i);
				break;
			case 5: //bottom left
				nodeX = current.getRow() + 1;
				nodeY = current.getCol() - 1;
				generateNode(nodeX, nodeY, gameBoard, cList, oList, endX, endY, current, i);
				break;
			case 6: //bottom middle
				nodeX = current.getRow() + 1;
				nodeY = current.getCol();
				generateNode(nodeX, nodeY, gameBoard, cList, oList, endX, endY, current, i);
				break;
			case 7: //bottom right
				nodeX = current.getRow() + 1;
				nodeY = current.getCol() + 1;
				generateNode(nodeX, nodeY, gameBoard, cList, oList, endX, endY, current, i);
				break;				
			}//end switch
		}//end loop
	}//end generateNeighbor
	
	//checks for the passed node in the closed list
	public static boolean inClosedList(ArrayList<Node> list, Node node) {
		for (Node n : list) {
			if (n.equals(node)) {
				return true;
			}
		}
		return false;
	}//end closedCheck
	
	//calculates the Heuristic of a node 
	public static int calcHeuristic (int nodeX, int nodeY, int endX, int endY) {
		int heuristic;
		heuristic = (Math.abs(endX - nodeX) + Math.abs(endY - nodeY))*10; //each block is worth 10 points
		return heuristic;
	}//end calcHeur
	
	/*
	 * determines if the neighbor trying to be generated is a valid option 
	 * by ensuring that it is within the bounds of the board and 
	 * also not a blocker node
	 */
	public static boolean validNeighbor(int x, int y, char[][] gameBoard, ArrayList<Node> cList) {
		Node compare = new Node(x, y);
		if (x < 0 || x > 14 || y < 0 || y > 14 || gameBoard[x][y] == '-') return false; //if out-of-bounds or a block, not valid
		else if(inClosedList(cList, compare)) return false; //if in closed list, not valid
		else return true;
	}//end validCheck
	
	/*
	 * The generateNode method is responsible for generating all the information
	 * a node would  have, in addition to calling a check to validNeighbor to ensure its usable
	 * If it is valid, its assigns a g value, 
	 * checks the openList for the node, and if it is already in the oList, it decides to update it or not based on the new g value generated
	 * After the check it assigns a H, F, and parent to the node and adds it to the open list.
	 */
	public static void generateNode(int x, int y, char[][] gameBoard, ArrayList<Node> cList, PriorityQueue<Node> oList, int endX, int endY, Node current, int count) {
		if (validNeighbor(x, y, gameBoard, cList)) {
			//CHECK OPEN LIST BEFORE MAKING NEW NODE __________________------------__________________
			Node newNode = new Node(x, y);		
			switch(count) {
			case 0:
			case 2:
			case 5:
			case 7:
				newNode.setG(current.getG() + 14);
				break;
			case 1:
			case 3:
			case 4:
			case 6:
				newNode.setG(current.getG() + 10);
				break;
			}//end switch
			
			
			Iterator<Node> iter = oList.iterator();
			
			while(iter.hasNext()) {
				Node next = iter.next();
				if (next.equals(newNode)) {
					if (next.getG() <= newNode.getG()) {
						return;
					}
					else {
						iter.remove();
					}
				}
			}
			newNode.setH(calcHeuristic(x, y, endX, endY));
			newNode.setF();
			newNode.setParent(current);
			oList.add(newNode);
		}
	}
}//end class
	
