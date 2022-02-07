package org.howard.edu.lsp.assignment2;
import java.util.*;

public class assignment_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		
		int j = 0;
		while (j == 0) {
			// prompting the user for a string
			System.out.print("String?");  
			// reads string
			String input = sc.nextLine();
			//if the condition is met it terminates the execution
			if (input.equals("Goodbye")){
				j ++;
				break;
			}
			// since each token is separated by a space, splitting the input string based on the delimeter " " and storing the strings to an array

			String[] delimeted_input = input.split(" ");
			// resetting the sum and product every time we get a new input from the user
			int tokenSum = 0;
			int tokenProduct = 1;
			// in case the string wasn't Goodbye, we loop through each string in our delimited array 
			System.out.println("Tokens:");
			for (int i = 0; i < delimeted_input.length; i++){
				//prints the tokens first 
				System.out.printf("%s", delimeted_input[i]);
				//calculates the token sum with each loop
				tokenSum = Integer.parseInt(delimeted_input[i]) + tokenSum;
				// calculates the token product
				tokenProduct = Integer.parseInt(delimeted_input[i]) * tokenProduct;
			}
			// finally prints the calculated sum and product
			System.out.printf("Sum: %d\n", tokenSum);
			System.out.printf("Product: %d\n", tokenProduct);
		}

	}

}
