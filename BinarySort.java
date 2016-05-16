
// U10111003 朱永捷

public class BinarySort{

	// Data field to define Datum point
	private Node datum;

	// No-arugument constructor
	public BinarySort() {
	}

	// Constructor
	public BinarySort(int value) {
		datum = new Node(value);
	}

	// Set method
	public void setDatum(int value) {
		datum = new Node(value);
	}

	// Get method
	public Node getDatum() {
		return datum;
	}

	// Compare to insert right or left
	public void insert(int data){
		int time = 0;
		Node com = datum;
		while (time == 0){
			if (data > com.getData()) {
				if (com.right == null){
					com.right = new Node(data);
					time = 1;
				} else {
					com = com.right;
				}
			} else {
				if (com.left == null){
					com.left = new Node(data);
					time = 1;
				} else {
					com = com.left;
				}
			}
		}
	}

	// To print result
	public void print(Node node) {
		if (node != null) {
			print(node.left);
			System.out.print( node.getData() + "  ");
			print(node.right);
  		}
	}
}
