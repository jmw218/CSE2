//Joshua Whitton
//March 5th 2015
//CSE2
//
//Create a program that does a triangular wave pattern based on user integer input.
import java.util.Scanner;

public class waves
{
    public static void main(String[] args)
    {
        while(true)  //an infinite loop that will be ended by a break;
        {
            int userInput = 0;  //creates a variable to hold user input
            
            Scanner waveScan = new Scanner(System.in);  //creates a scanner, will be re-made every time while statement loops
            System.out.println("Enter a value from 1 to 30.");
            if(waveScan.hasNextInt())  //asks user for input from 1 to 30 and checks if they entered an int correctly.
            {
                userInput = waveScan.nextInt();  //sets userinput variable to the input
                if(userInput <= 30 && userInput >= 1)  //checks if it is less than or equal to 30 and greater than or equal to 1.
                {
                    System.out.println("");  //puts a space
                    System.out.println("FOR LOOP: ");  //declares that this line is the for loop method
                    for(int i = 1; i <= userInput; i++)  //creates i at 1 initially, each loop makes sure it is <= than userinput, then adds 1 after inner code is run
                    {
                        for(int f = 1; f <= i; f++)  //f = 1 initially, checks if f is <= to i, then after running inner it adds 1 to f.
                        {
                            if(i % 2 == 0)  //checks if the number is even
                            {
                                for(int q = 1; q <= f; q++)
                                {
                                    System.out.print(i);  //if even, it starts at 1 then goes up until it hits the limit.
                                }
                                System.out.println("");  //seperates lines
                            }
                            else
                            {
                                for(int q = i; q >= f; q--)  //if odd, the program starts at the limit (i) and prints down until it hits f to stop it.
                                {
                                    System.out.print(i);
                                }
                                System.out.println("");
                            }
                        }
                    }
                    System.out.println(""); //makes a line
                    
                    
                    System.out.println("WHILE LOOP: ");  //this is the while loop method
                    int iWhile = 1;  //initializes a variable starting at 1
                    while(iWhile <= userInput)  //makes sure it is <= userinput
                    {
                        int fWhile = 1;  //sets up an f variable at 1
                        while(fWhile <= iWhile)  //makes sure it is less than i variable
                        {
                            if(iWhile % 2 == 0)  //checks if even
                            {
                                int qWhile = 1;  //initializes the q variable at 1
                                while(qWhile <= fWhile)  //loops while it is <= f variable
                                {
                                    System.out.print(iWhile);  //prints the i variable
                                    qWhile++;  //adds 1 to q variable so eventually loop ends
                                }
                                System.out.println("");  //creates a new line for it
                            }
                            else  //if it is odd
                            {
                                int qWhile = 1;  //initializes the q variable (Is in a seperate scope)
                                qWhile = iWhile;  //this time makes it equal to the i variable so that it starts at the upper
                                while(qWhile >= fWhile)  //loop checks if this value is greater than the f variable
                                {
                                    System.out.print(iWhile);  //prints the i variable
                                    qWhile--;  //subtracts the q variable so it gets closer to the f
                                }
                                System.out.println("");  //new line
                            }
                            fWhile++;  //increases the f variable for the loop
                        }
                        iWhile++;  //increases the i variable for the loop
                    }
                    System.out.println("");  //new line
                    
                    
                    System.out.println("DO WHILE LOOP: ");  //do while method
                    int iDo = 1;  //creates i variable at 1
                    do  //do this
                    {
                        int fDo = 1;  //creates f variable at 1
                        do
                        {
                            if(iDo % 2 == 0)  //checks if the i variable is even
                            {
                                int qDo = 1;  //if so, creates q variable at 1
                                do
                                {
                                    System.out.print(iDo);  //then prints the i variable
                                    qDo++;  //increases q variable
                                }while(qDo <= fDo);  //continues the loop again if q variable <= f variable
                                System.out.println(""); //new line
                            }
                            else  //if odd
                            {
                                int qDo = 1;
                                qDo = iDo;  //creates q variable then sets it equal to i variable
                                do
                                {
                                    System.out.print(iDo); //prints i variable
                                    qDo--;  //subtracts from q variable
                                }while(qDo >= fDo);  //will continue looping until q variable is no longer >= f variable
                                System.out.println("");  //new line
                            }
                            fDo++;  //increases the f variable for loop
                        }while(fDo <= iDo);  //makes sure the f variable is <= to the i variable
                        iDo++;  //increases i variable for loop
                    }while(iDo <= userInput);  //checks that i variable is still less than the user input
                    System.out.println("");  //new line
                    
                    break;  //ends the infinite loop
                }
                else{ System.out.println("Please re-enter input that is from 1 to 30."); }  //informs user to re-enter input
            }
            else{ System.out.println("Please re-enter input that is from 1 to 30."); }  //informs user to re-enter input
        }
    }
}