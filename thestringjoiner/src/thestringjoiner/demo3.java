package thestringjoiner;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String str1= scan.next();
		String str2= scan.next();
		System.out.println(str1+" "+str2);
		// TODO Auto-generated method stub

	}
 public static String joinstrings(String str1, String str2) 
 {
	return str1+str2;
 }
}
