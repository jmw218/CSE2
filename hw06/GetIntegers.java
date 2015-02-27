//Joshua Whitton
//Febuary 27th 2015
//CSE2
//
//Program 1 - Get input from the user of 5 positive integers, then print the sum of them.
//Use for-loops in the program.
import java.util.Scanner;

public class GetIntegers
{
    public static void main(String[] args)
    {
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        int fifthNum = 0;  //variables for saved user input
        
        int userInput = 0;  //variable for the current input
        
        System.out.println("Enter input for 5 non-negative integers.");
        for(int n = 0; n < 5; n++)  //creates a for statement which goes until n is no longer equal to 5.
        {
            Scanner userScan = new Scanner(System.in);  //declares the scanner inside the scope to prevent a loop
            if (userScan.hasNextInt())  //makes sure the user input is an integer
            {
                userInput = userScan.nextInt();  //sets the input to an integer variable
                if(userInput >= 0)  //makes sure the integer is positive or equal to 0
                {
                    switch(n)  //creates a switch statement which checks the current position of the for statement
                    {
                        case 0:
                            firstNum = userInput;  //using switch, sets first variable to first correct input.
                            break;
                        case 1:
                            secondNum = userInput;  //second correct input
                            break;
                        case 2:
                            thirdNum = userInput;  //third correct input
                            break;
                        case 3:
                            fourthNum = userInput; //fourth correct input
                            break;
                        case 4:
                            fifthNum = userInput; //fifth correct input
                            break;
                    }
                }
                else{
                    System.out.println("Invalid input, please enter a non-negative integer.");
                    n--;  //if the number isn't positive or 0, it subtracts 1 from n so that the loop will not end prematurely.
                }
            }
            else{
                System.out.println("Invalid input, please enter a non-negative integer.");
                n--;  //if the number isn't an int, subracts 1 from n so that the for statement won't end early.
            }
        }
        System.out.println("The sum of your numbers is: " + (firstNum + secondNum + thirdNum + fourthNum + fifthNum));
        //prints out the sum of all of the collect user input integers.
    }
}