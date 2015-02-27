//Joshua Whitton
//febuary 27th 2015
//CSE2
//
//Program 2 - We must use a while-loop to create a program that can solve factorial problems.
//The program will accept input from 9 to 16, and only positive integers.

import java.util.Scanner;

public class RunFactorial
{
    public static void main(String[] args)
    {
        boolean inputStopper = true;
        int userInput = 0; //a variable to hold the user input
        int theNumber = 0;  //a variable to hold the final input that is found to be correct
        
        System.out.println("Please enter a positive integer from 9 to 16, inclusively.");
        while(inputStopper)  //asks the user to enter input, then sets up a while loop that has a true boolean initially
        {
            Scanner factScan = new Scanner(System.in);
            if(factScan.hasNextInt())  //checks if the user inputs an integer
            {
                userInput = factScan.nextInt();  //sets the integer input to the userInput variable
                if(userInput >= 9 && userInput <= 16)  //makes sure it is between 9 and 16 inclusively
                {
                    theNumber = userInput;  //sets theNumber to the input
                    inputStopper = false;  //ends the while statement by making the boolean false.
                }
                else{
                    System.out.println("Please enter a positive integer from 9 to 16, inclusively.");  //informs user of invalid input
                }
            }
            else{
                System.out.println("Please enter a positive integer from 9 to 16, inclusively.");  //tells user they used wrong input
            }
        }
        
        System.out.println("The input has been accepted.");  //tells the user that their input worked
        
        int factorialValue = theNumber;  //sets factorialValue to be equal to the earlier inputted number
        
        while(theNumber > 1)  //while the number is greater than 1
        {
            factorialValue *= --theNumber;   //it subtracts 1 from the input in theNumber variable, then it sets the factorialValue
        }                                   //variable equal to itself times that.
        System.out.println("The factorial of your number is: " + factorialValue);  //prints factorial. 13, 14, 15, and 16 seem
    }                                                                             // to come up with errored results.
}