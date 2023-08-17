package bitwiseswapper;

import java.util.Scanner;

public class bitwise {
		public static void swapUsingBitwise(int a, int b) {
	        a = a ^ b;
	        b = a ^ b;
	        a = a ^ b;

	        System.out.println("After swapping: First = " + a + ", Second = " + b);
	    }
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first integer: ");
	        int first = scanner.nextInt();
	        System.out.print("Enter the second integer: ");
	        int second = scanner.nextInt();
	        System.out.println("Before swapping: First = " + first + ", Second = " + second);
	        swapUsingBitwise(first, second);
	        scanner.close();
	    }
}
