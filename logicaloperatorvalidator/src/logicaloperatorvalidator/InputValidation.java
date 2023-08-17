package logicaloperatorvalidator;

import java.util.Scanner;

public class InputValidation{

		    // Method to validate user input based on conditions
		    public static boolean isValidInput(boolean isInputValid, boolean meetsCondition) {
		        return isInputValid && meetsCondition;
		    }

		    public static void main(String[] args) {
		        // Sample input values
		        boolean isInputValid = true;
		        boolean meetsCondition = true;

		        // Call the isValidInput method
		        boolean isValid = isValidInput(isInputValid, meetsCondition);

		        if (isValid) {
		            System.out.println("Input is valid.");
		        } else {
		            System.out.println("Input is not valid.");
		        }
		    }
		}





