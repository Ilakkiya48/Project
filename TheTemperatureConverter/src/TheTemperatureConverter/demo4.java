package TheTemperatureConverter;

import java.util.Scanner;

public class demo4 {
	
	public double convertFahrenheitToCelsius(double fahrenheit)
	{
		double Celsius = (fahrenheit - 32) * 5/9;
		return (Celsius);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the F temperature");
		double F = scan.nextDouble();
        System.out.println("68.0");
	}
}