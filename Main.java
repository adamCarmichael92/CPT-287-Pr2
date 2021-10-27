package project_2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Open input file, scanner, output file, and writer
		FileInputStream inputFile = new FileInputStream("input.txt");
		Scanner scanner = new Scanner(inputFile);
		
		//Scan input file and call the functions to calculate expressions from input file
		while (scanner.hasNextLine()) {
			String infixExp = scanner.nextLine();
			//insert function for converting infix to postfix
			String postfix = infixToPostfix(infixExp);
			//insert function to evaluate postfix expression and print to screen
			System.out.println(evaluatePostfix(postfix));
		}
		scanner.close();
		inputFile.close();
	}
}
