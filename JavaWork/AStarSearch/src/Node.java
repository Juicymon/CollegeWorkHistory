public class Node implements Comparable<Node>{
	
	private int row, col, f, g, h;
	private Node parent;
   
	public Node(int r, int c){
		row = r;
		col = c;
		//type = t;
		parent = null;
		//type 0 is traverseable, 1 is not
	}
	
	//mutator methods to set values
	public void setF(){
		f = g + h;
	}
	public void setG(int value){
		g = value;
	}
	public void setH(int value){
		h = value;
	}
	public void setParent(Node n){
		parent = n;
	}
	
	//accessor methods to get values
	public int getF(){
		return f;
	}
	public int getG(){
		return g;
	}
	public int getH(){
		return h;
	}
	public Node getParent(){
		return parent;
	}
	public int getRow(){
		return row;
	}
	public int getCol(){
		return col;
	}
	
	public boolean equals(Object in){
		//typecast to Node
		Node n = (Node) in;
		
		return row == n.getRow() && col == n.getCol();
	}
   
	public String toString(){
		return "Node: " + row + "_" + col;
	}
	
	@Override
	public int compareTo(Node n) {
		if (this.getF() < n.getF()) { return -1;}
		if (this.getF() > n.getF()) {return 1;}
		return 0;
	}
}