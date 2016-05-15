
//U10111003 朱永捷

class Node{
	// data field
	int data;
	Node left;
	Node right;

	// No-arugument constructor
	public Node(){
	}

	// constructor creates binary tree
	public Node(int value){
		data = value;
		left = null;
		right = null;
	}
	
	// Get methods
	public int getData() { 
		return data; 
	} 

	public Node getLeft() { 
		return left; 
	}

	public Node getRight() { 
		return right; 
	} 
}
