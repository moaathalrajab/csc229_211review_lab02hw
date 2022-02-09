package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		// DONE

		// ToDo 6: Fix the constructor of Student class
		// DONE?

		// ToDo 7: Add a toString method for Student class
		// DONE

		Student std1= new Student("James", (short) 20);
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		// DONE

		Scanner input = new Scanner(System.in);

		/*
		 * Prompt for input.
		 */
		System.out.println("\nPlease provide the new GPA for this student: ");
		double newGPA;


		/*
		 * Validation for GPA being between 1 & 4.
		 */
		while(true){
			newGPA = input.nextDouble();

			if(newGPA > 4 || newGPA < 0){
				System.out.println("\nNot a Valid GPA, please try again. ");
				continue;
			}
			break;
		}

		// Set new GPA
		std1.setGPA(newGPA);


		// Print it all out!
		System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		// DONE
		
		// ToDo 10: submit using a pull request.
		// DONE
	}

}