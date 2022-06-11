/**
 * Description
 *
 * @author Ayana Bando
 * @since 2022-06-08
 * This program calculates the area of a triangle and prints a floating decimal point integer
 */


import java.util.Scanner;

public class TriangleArea {
    
    public static void main (String[] args) {
        
        findArea(); // this method gets numbers from the user and outputs the area of the triangle
        
    }
    
    // this method gets numbers from the user, calculates the area of the triangle, and outputs it
    public static void findArea() {
    	
    	// Instantiate a Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for height and store the input in the variable 'height'
        System.out.println("Enter the height:");
        int height = scanner.nextInt();

        // Prompt the user for the base and store the input in the variable 'base'        
        System.out.println("Enter the base:");
        int base = scanner.nextInt();
        
        // ========== INSERT YOUR CODE HERE ==========
        // Calculate the area with user's input and store in variable - 'area' - as a floating point integer
        double area = 0.5 * (height * base);

        // Output the calculated answer
        System.out.println("The area of the triangle is " + area + ".");
        
        

        
        
        
        
        // ===========================================
    }
    

}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Remembering that while parentheses signifies multiplication in math, the computer
still needs '*' to process the calculation


2. What will you always remember (never forget) from this exercise?
To use comments as a way to document and explain my code



*/