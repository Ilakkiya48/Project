package doublethevalue;

import java.util.Scanner;

public class doublethevalue {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int num=scan.nextInt();
	System.out.println(doubleTheNumber(num));
	}
    public static int doubleTheNumber(int num) {
    return 2*num;
  }
    
}

