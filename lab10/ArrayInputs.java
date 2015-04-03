//Joshua Whitton
//April 3rd 2015
//CSE2
//
//To practice using arrays by filling an array with user input.

import java.util.Scanner;  //imports scanner

public class ArrayInputs
{
    public static void main(String[] args)
    {
        int arraySize = 0;  //sets up a variable to hold array size
        boolean keepGoing = true;  //a boolean to keep while loop running
        
        System.out.println("Please enter the size of your desired array.");
        while(keepGoing)  //running until changed to false
        {
            Scanner userScan = new Scanner(System.in);
            if(userScan.hasNextInt())
            {
                arraySize = userScan.nextInt();  //scanner checks if it is a positive int
                if(arraySize > 0)
                {
                    keepGoing = false;  //ends the loop
                }
                else{
                    System.out.println("Please re-enter the array size as a positive integer.");
                }
            }
            else{
                System.out.println("Please re-enter the array size as a positive integer.");
            }
        }
        
        int[] userArray;
        userArray = new int[arraySize];  //creates an array with the user input size length
        
        System.out.println("Please enter " + arraySize + " positive integers to be put into your array.");
        
        int keepArray = 0;  //sets up a variable for the while loop
        
        while(keepArray < arraySize)  //runs until it reaches array length
        {
            int addArray;
            Scanner arrayScan = new Scanner(System.in);
            if(arrayScan.hasNextInt())
            {
                addArray = arrayScan.nextInt();
                if(addArray > 0)
                {
                    userArray[keepArray] = addArray;  //makes sure it is a positive int then adds it to array
                    keepArray++;  //increaes the adder variable
                }
                else{
                    System.out.println("Please re-enter a positive integer.");
                }
            }
            else{
                System.out.println("Please re-enter a positive integer.");
            }
        }
        System.out.println("Your array is: ");
        int printArray = 0;
        while(printArray < arraySize)
        {
            System.out.print(userArray[printArray]);
            printArray++;
            if(printArray < arraySize)  //prints out the array
            {
                System.out.print(", ");
            }
            else{
                System.out.print(".");
            }
        }
        System.out.println("");
    }
}