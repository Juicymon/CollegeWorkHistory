import java.util.concurrent.ThreadLocalRandom;
/*
 * Joseph Steiger
 * 2/15/22
 * 
 * 8Queens hill climbing algorithm. 
 * This program takes 8 randomly placed queens, determines a heuristic value from the goal state
 * and iterates through better neighbor states until the goal state is reached. 
*/
public class EightQueensProblem {
	//global values
	static int restarts = 0;
	static int stateChanges = 0;
	
	public static void main(String[] args) {
		//vars
		int currentHeur;
		int[][] gameBoard = new int[8][8];
		Queen[] queens = new Queen[8]; 
		int[][] heuristicValues = new int [8][8];
		
		createGameBoard(gameBoard, queens); //creates starter board
		currentHeur = conflictCheck(gameBoard, queens); //creates heuristic value
		System.out.println("Current Heuristic: " + currentHeur); 
		System.out.println("--Current State--");
		printBoard(gameBoard, queens);
		
		//continues to iterate through board and move queens until either local minima 
		//is hit or goal state is reached
		while(currentHeur != 0){
			createNeighbors(gameBoard, queens, heuristicValues); //finds all possible neighbor states
			setNewState(gameBoard, queens, heuristicValues, currentHeur); //moves to neighbor state or restarts
			currentHeur = conflictCheck(gameBoard, queens); //reevaluates heuristic
			
			System.out.println("\nCurrent Heuristic: " + currentHeur); 
			System.out.println("--Current State--");
			printBoard(gameBoard, queens);
		}//end while
		
		System.out.println("Solution Found!" + 
							"\nStates changes: " + stateChanges + 
							"\nRestarts: " + restarts);
		}//end main
	
	//method for populating the board and randomly generating the location of the queens
	public static int[][] createGameBoard (int[][] board, Queen[] placedQueens){
		int randomNum = ThreadLocalRandom.current().nextInt(0, 8); //creates a random number
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[j][i] = 0;
			}
			board[randomNum][i] = 1;
			placedQueens[i] = new Queen(randomNum, i); //holds location of the placed queen
			randomNum = ThreadLocalRandom.current().nextInt(0, 8); //generates new random 
		}
		return board;
	}//end createGame
	
	//prints the currents state of the board
	public static void printBoard(int[][] board, Queen[] queenLoc) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
	}//end printBoard
	
	//generates the heuristic by checking for conflicts around every queen
	public static int conflictCheck(int[][] board, Queen[] queenLoc) {
		int heuristic = 0;
		int row, column;
		
		//loops through each column's queen to find conflicts, starts far left and checks right
		for(int col = 0; col < 8; col++) {
			row = queenLoc[col].getRow(); //gets current queen location
			column = (col + 1); //starts in next column
			
			//checks right in row
			while (column < 8 ) {
				if (board[row][column] == 1) 
					heuristic++;	
				column++;
			}

			//checks diagonally up right
			column = (col + 1);
			row--;
			while (column < 8 && row > -1) { //wrong way 
				if (board[row][column] == 1) 
					heuristic++;
				column++;
				row--;
			}
			
			//checks down right
			column = (col + 1);
			row = (queenLoc[col].getRow() + 1);
			while (column < 8 && row < 8) {
				if (board[row][column] == 1) 
					heuristic++;
				column++;
				row++;
			}	
		}
		return heuristic;
	}//end conflict
	
	//creates an array similar to the game board holding a heuristic value for each 
	//possible position of a queen in that spot, checking every neighbor state
	public static void createNeighbors(int [][] board, Queen[] queenLoc, int[][] heuristics) {
		int currentRow, heuristic;
		
		for (int col = 0; col < 8; col++) {
			currentRow = queenLoc[col].getRow();//row to check 
			
			//loops through each row and generates a heur. value
			for (int row = 0; row < 8; row++) {	
				board[currentRow][col] = 1;
				queenLoc[col].setRow(currentRow);
				heuristic = conflictCheck (board, queenLoc);
				heuristics[currentRow][col] = heuristic;
				board[currentRow][col] = 0;
				currentRow++;
				if (currentRow > 7)//if at end of board, move to top
					currentRow = 0;
			}//end row switch
			queenLoc[col].setRow(currentRow);
			board[queenLoc[col].getRow()][col] = 1;
		}//end col search
	} //end createNeighbors
	
	//determines the best next move for the agent to make based on the heuristic neighbors and current value 
	//generated before
	//restarts if no best is found
	public static void setNewState(int[][] board, Queen[] queenLoc, int[][] heuristics, int heuristic) {
		int lowest = heuristic;
		int lCol = 0, lRow = 0, count = 0;
		
		//loops through the heuristics and finds best value
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				if (heuristics[r][c] < lowest) {
					lowest = heuristics[r][c];
					lRow = r;
					lCol = c;
					count = 1;
				}
				else if (heuristics[r][c] == lowest && lowest != heuristic) {
						count++; //if duplicate found, add to count
					}
			}//end loop		
		}//end checking
			System.out.println("Neighbors found with lower h: " + count);
			
			//sets new state if lower neighbor state found, or restarts if heuristics are equal
			if (lowest != heuristic) {
				System.out.println("Setting new current state.");
				board[queenLoc[lCol].getRow()][lCol] = 0;
				queenLoc[lCol].setRow(lRow);
				board[lRow][lCol] = 1;
				stateChanges++;
			}
			else {
				System.out.println("Local minima reached, restarting...");
				createGameBoard(board, queenLoc);
				restarts++;
			}
	}//end setNewState
}//end class

//queen class for creating a queen object, simply to track their location easily
 class Queen {
	 int row, column;
	 
	 public Queen (int row, int column) {
		 this.row = row; 
		 this.column = column;
	 }
	 
	 public int getRow() {
		 return this.row;
	 }
	 
	 public int getColumn() {
		 return this.column;
	 }
	 
	 public int setRow(int row) {
		 return this.row = row;
	 }
}//end queen class
 
