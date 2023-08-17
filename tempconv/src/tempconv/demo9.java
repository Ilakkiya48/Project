package tempconv;

import java.util.Scanner;

public class demo9 {
	    // Method to convert CelsiustoFahrenheit
	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9/5) + 32;
	    }
	    // Method to convert FahrenheittoCelsius
	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5/9;
	    }
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Welcome to the Temperature Conversion Tool!\n");
		        System.out.println("Select an option:\n");
		        System.out.println("1. Convert Celsius to Fahrenheit");
		        System.out.println("2. Convert Fahrenheit to Celsius\n");

		        System.out.print("Enter your choice: ");
		        int choice = scanner.nextInt();

		        if (choice == 1) {
		            System.out.print("Enter the temperature in Celsius: ");
		            double celsius = scanner.nextDouble();
		            double fahrenheit = celsiusToFahrenheit(celsius);
		            System.out.printf("%.1f°C is equivalent to %.1f°F%n", celsius, fahrenheit);
		        } else if (choice == 2) {
		            System.out.print("Enter the temperature in Fahrenheit: ");
		            double fahrenheit = scanner.nextDouble();
		            double celsius = fahrenheitToCelsius(fahrenheit);
		            System.out.printf("%.1f°F is equivalent to %.1f°C%n", fahrenheit, celsius);
		        } else {
		            System.out.println("Invalid choice. Please select either 1 or 2.");
		        }	        
		        scanner.close();
	}
}

