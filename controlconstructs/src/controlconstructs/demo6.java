package controlconstructs;

import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int marks = scan.nextInt();
		System.out.println("welcome to kodnest");
		check check=new check();
		int c = check.checkmarks(marks);
	}
		public class check{
			void checkMarks(int marks)	{
			if(marks>=80);
			{
				System.out.println("welcome to techclub");
			}
		}
		}
}



