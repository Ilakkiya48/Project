package bitwisebitcounter;
import java.util.Scanner;
public class demo12 {
		public static int countSetBits(int number) {
	        int count = 0;

	        while (number > 0) {
	            count += number & 1;
	            number >>= 1; // Right shift by 1 to check the next bit
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int input = scanner.nextInt();

	        int setBitsCount = countSetBits(input);

	        System.out.println("Number of set bits: " + setBitsCount);

	        scanner.close();
	    }
}

