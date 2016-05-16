
// U10111003 朱永捷

import java.util.Scanner;
import java.util.ArrayList;

public class TestBinarySort{
	// main class
	public static void main(String[] args){
		int i = 0;
		ArrayList<Integer> input = new ArrayList<>();
		BinarySort binaryTree = new BinarySort();
		Scanner scanner = new Scanner(System.in);

		// Promt user to enter data
		System.out.println("How many number do you want to enter?");
		int time = scanner.nextInt();
		System.out.println("To enter number:");
		while (i < time) {
			if (i == 0){
				int value = scanner.nextInt();
				input.add(value);
				binaryTree.setDatum(value);
				i++;
			} else {
				int value = scanner.nextInt();
				input.add(value);
				binaryTree.insert(value);
				i++;
			}
		}

		// To show result
		System.out.println("Your enter: " + input.toString());
		System.out.print("BinarySort: [ ");
		binaryTree.print(binaryTree.getDatum());
		System.out.print("]");
	}
}
