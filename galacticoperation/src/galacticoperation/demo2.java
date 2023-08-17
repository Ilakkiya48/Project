package galacticoperation;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		Long num1=scan.nextLong();
		Long num2=scan.nextLong();
		System.out.println("adding of 2 numbers(num1,num2)");
	}
	public static Long galacticAddition(Long num1,Long num2)
	{
    return (num1+num2);
	}
}
