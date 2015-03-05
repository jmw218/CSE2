//Joshua Whitton
//March 5th 2015
//CSE2
//
//This program is for practicing while loops with break statements.
import java.util.Scanner;

public class zigzag
{
    public static void main(String[] args)
    {
        
        int nStars = 10;  //initial variable set as 10.
        int nStarts;  //a variable initialization for use in loops later
        
        String repeatValue;  //a String variable for use in asking whether to continue.
        
        System.out.println("Enter an integer from 3 to 33.");  //asks user for an int from 3 to 33
        while(true)  //an infinite loop that can only be ended by a break statement
        {
            Scanner zigScan = new Scanner(System.in);  //creates a scanner called zigScan for use in the program
            Scanner trueScan = new Scanner(System.in);  //Creates a scanner called trueScan
            
            if(zigScan.hasNextInt())  //checks if the user enters an integer value, otherwise asks them to re-enter
            {
                nStars = zigScan.nextInt();  //sets up the entered value into an int variable
                if(nStars >= 3 && nStars <= 33)  //makes sure it is from 3 to 33
                {
                    for(int i = 0; i < nStars; i++)  //loop statement that prints * nStars amount of times
                    {
                        System.out.print("*");
                    }
                    System.out.println("");  //sets up a new line
                    for(int f = 0; f < nStars - 2; f++)  //loop that will print spaces and a single * on each line. -2 is used to make the amount of lines 2 less than the nStars
                    {                                   //so that it makes the z shape correctly
                        System.out.print(" ");
                        for(int q = 0; q < f; q++)  //this makes sure the correct amount of spaces are used each line
                        {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        System.out.println("");
                    }
                    
                    for(int i = 0; i < nStars; i++)  //a repeat from earlier that prints nStars amount of *s on a line.
                    {
                        System.out.print("*");
                    }
                }
                else{
                    System.out.println("Please re-enter a value from 3 to 33."); //if the input isn't from 3 to 33 it tells the user this than repeats the loop without going through the rest (using continue)
                    continue;
                }
            }
            else{
                System.out.println("Please re-enter a value from 3 to 33.");  //if the input isn't an integer it sends it back to the start asking the user to re-enter input.
                continue;
            }
            System.out.println("");  //new line setup
            System.out.println("Enter y or Y to go again, otherwise enter something else.");  //asks for user to enter y or Y if they want to continue
            repeatValue = trueScan.nextLine();
            if(repeatValue.equals("y") || repeatValue.equals("Y"))  //checks if they entered y or Y or something else.
            {
                System.out.println("Enter an integer from 3 to 33.");  //if they did, it asks the user to input again and repeats the loop.
            }
            else{ break; }  //if they entered a different value it breaks the infinite while loop.
        }
    }
}