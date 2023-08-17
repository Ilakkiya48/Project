package thecalculatordilemma;

import java.util.Scanner;

public class demo8 {

	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("enter a number");
    int num=scan.nextInt();
    int num2=scan.nextInt();
    char a=scan.next().charAt(0);
    switch(a)
    {
	case '+':
		System.out.println(num+num2);
        break;
    
	case '-':
	     System.out.println(num-num2);
         break;
    
	case '*':
		System.out.println(num*num2);
	    break;
    
	case '/':
		System.out.println(num/num2);
	    break;
	    
	case '%':
		System.out.println(num%num2);
	    break;
	    
	default:
		System.out.println("invalid");
	}

}
}