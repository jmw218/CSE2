//Joshua Whitton
//Febuary 9th 2015
//CSE2
//
//Program 2
//This program takes a double entered by the user and uses it to estimate the cube root of the number and the value of the guess when cubed.

import java.util.Scanner; //takes the scanner utitility for use in the program

public class Root  //the root class for the program
{
    public static void main(String[] args) //The programs main method to be used
    {
        Scanner rootScanner;
        rootScanner = new Scanner(System.in);  //the root scanner is created to use for user input
        
        System.out.print("Enter a double value to get the cubed root of: ");
        double theRoot = rootScanner.nextDouble();  //gets a double value from the user
        
        double guess = theRoot / 3;  //sets up the first extremely crude estimate
        
        guess = ((2*guess*guess*guess) + theRoot)/(3*guess*guess);  //refines the estimate a bit using the first estimate
        guess = ((2*guess*guess*guess) + theRoot)/(3*guess*guess);
        guess = ((2*guess*guess*guess) + theRoot)/(3*guess*guess);
        guess = ((2*guess*guess*guess) + theRoot)/(3*guess*guess);
        guess = ((2*guess*guess*guess) + theRoot)/(3*guess*guess);  //goes through and refines it multiple times in order to get an accurate answer.
        
        System.out.println("The crude estimate: " + guess);  //prints the cubed root estimate
        System.out.println("The estimate cubed: " + (guess*guess*guess));  //cubes the estimate to show how close it was
    }
}