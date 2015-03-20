//Joshua Whitton
//March 20th 2015
//CSE2
//
//The purpose of this lab is to calculate the super factorial
//a factorial is n*(n-1)*(n-2)...1
//super factorial is n!+(n-1)!+(n-2)!...1!
//Uses n input from the user
import java.util.Scanner;

public class Factorials
{
    public static void main(String[] args)
    {
        int userNum = 0;
        int numFactorial = 0;
        int superFact = 0;
        int userNumSaver = 0;  //create variables for user input, the factorial, the super factorial,
                                //and a second copy of the user input
        Scanner factScan = new Scanner(System.in);  //create scanner
        System.out.println("Please enter a positive integer to find the super factorial of:");
        if(factScan.hasNextInt())  //asks for an int input and checks if it really is an int
        {
            userNum = factScan.nextInt();  //sets userNum to user input
            userNumSaver = userNum;  //creates copy of user input
            if(userNum >= 0)
            {
                for(int i = 0; i < userNum;)  //repeats loop until the user input is lowered to 0
                {
                    numFactorial = factorial(userNum);  //gets factorial
                    superFact += numFactorial;  //adds it to super factorial
                    userNum--; //lowers the user input value to do another factorial next loop around
                }
                print(userNumSaver, superFact);  //calls on method to print input and super factorial
            }
            else{
                System.out.println("Your entry was a negative integer.");
            }
        }
        else{
            System.out.println("This input is not an integer.");
        }
    }
    public static int factorial(int input)
    {
        int factNum = input;
        for(int i = 1; i < input;)  //repeats this until the input is 1
        {
            input--;  //subtracts from input
            factNum = factNum * input;  //multiplies the partial factorial by the current input value
        }
        return factNum;  //returns the full factorial
    }
    public static void print(int input, int sum)
    {
        System.out.println("The super factorial of " + input + " is " + sum);  //prints the information
    }
}