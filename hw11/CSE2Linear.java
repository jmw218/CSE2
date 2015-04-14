//Joshua Whitton
//April 13 2015
//CSE2
//
//A program that will help practice programming ways to search arrays.

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear
{
    public static void main(String[] args)
    {
        int[] list = createArray(15, 0, 100); //creates an array of size 10, allowing values between 0 and 100 to be entered.
        
        System.out.println("The grades, sorted, are: ");
        printArray(list);  //prints the array out.
        
        System.out.println("Enter a grade to search for: ");
        Scanner searchScan = new Scanner(System.in);
        int searchInput = searchScan.nextInt();  //creates an int from user input
        
        binarySearch(list, searchInput);  //uses binary search to check if the user input is in the array
        
        arrayScrambler(list);  //scrambles the array randomly.

        printArray(list);  //prints the newly scrambled array.
        
        System.out.println("Enter a grade to search for: ");
        Scanner linearScan = new Scanner(System.in);
        int linearInput = linearScan.nextInt();  //creates an int from user input
        linearSearch(list, linearInput);  //uses linear search to check if the input is found in the scrambled array.
    }
    
    public static void printArray(int[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");  //goes through and prints out every value from the array
        }
        System.out.println();
    }
    
    public static void binarySearch(int[] studentGrades, int searchInput)
    {
        int upper = studentGrades.length-1;  //upper is set to 1 less than the length, since array size is 15 but goes from 0 to 14.
        int lower = 0;
        int binCheck = (upper/2) + (lower/2);  //makes a checker starting at half upper plus half lower
        int tripCount = 0; //counts how many iterations have gone by.
        boolean continueCheck = true;  //this is used to keep the while loop running
        int failureCount = 0; //some numbers will fail the check test despite still being there, by checking twice it alleviates that issue.
        
        while(continueCheck)
        {
            if(studentGrades[binCheck] == searchInput)  //checks if the current mid value is what we're looking for
            {
                tripCount++;  //adds another iteration
                System.out.println(searchInput + " was found in the list, there were " + tripCount + " iterations.");  //says it has been found and how many iterations
                continueCheck = false;  //ends the while loop by making it false
            }
            else{
                
                if(lower == binCheck || upper == binCheck)  //this checks if the upper and lower are equal, which signifies the binary loop having completed its run.
                {
                    if(failureCount != 0)  //checks again after a failure due to the perimeters sometimes applying to numbers that are still available.
                    {
                        continueCheck = false;  //ends the while loop and tells the user the value was not found
                        System.out.println(searchInput + " was not found in the list after " + tripCount + " iterations.");
                    }
                    failureCount++;
                }
                
                tripCount++;  //adds an iteration
                
                if(tripCount > studentGrades.length)  //a backup to prevent infinite loops, isn't actually necessary.  The iterations won't ever go over length unless an error results in infinite loop.
                {
                    continueCheck = false;
                    System.out.println("An infinite loop almost occurred.");
                }
                
                if(studentGrades[binCheck] > searchInput)  //if the value at current mid point is greater than the value we're looking for
                {
                    upper = binCheck;  //it sets the upper value to the mid point
                    
                    binCheck = (upper/2) + (lower/2);  //sets the new mid point to half upper plus half lower
                }
                
                else{
                    lower = binCheck;  //sets the lower value to the current mid point
                    
                    binCheck = (upper/2) + (lower/2) + 1;  //sets the new mid point to half upper plus half lower.
                }
            }
            
        }
    }
    
    public static void arrayScrambler(int[] studentGrades)
    {
        int newRan = 0;  //new random number place holder
        int placeHolder = 0;  //holds the [i] array value while transferring
        System.out.println("Randomly scrambling the array: ");
        for(int i = 0; i < studentGrades.length;)  //goes across the entire array
        {
            newRan = (int) ((Math.random()) * studentGrades.length);  //gets a random number from 0 to the length
            placeHolder = studentGrades[i];  //puts [i] into a holder value
            studentGrades[i] = studentGrades[newRan];  //sets [i] = to [random number]
            studentGrades[newRan] = placeHolder;  //sets [random number] = to what [i] used to be.
            i++;  //increase i.
        }
    }
    
    public static void linearSearch(int[] studentGrades, int searchInput)
    {
        boolean checker = true;  //a checker for an if statement prevents a recurrence after the number is found
        int checkCount = 0;  //the iterations for if it fails to find the number
        for(int i = 0; i < studentGrades.length; i++)  //goes across the entire length of the array
        {
            if(studentGrades[i] == searchInput)
            {
                i++;  //this makes sure the iterations is above what it looked at.  If the number is at position 0 it will still say 1 iteration
                System.out.println(searchInput + " was found after " + i + " iterations.");
                checker = false; //prevents it from calling a failure if the number is found at the very last location
                i = studentGrades.length;
            }
            checkCount = i;  //sets checkcount equal to i.
        }
        if(checker)
        {
            checkCount++;
            System.out.println(searchInput + " was not found after " + checkCount + " iterations.");  //calls a failure if it failed to find the number across the array.
        }
    }
    
    public static int[] createArray(int size, int min, int max)
    {
        int[] studentGrades = new int[size];  //creates a new array using the size provided
        int allFif = 0;  //this is used to hold what current value the array is at
        int gradeInput = 0;
        System.out.println("Please enter " + size + " integers ranging from " + min + " to " + max + ", each must be greater than or equal to the one entered before it.");
        while(allFif < size)  //set to go through the entire size
        {
            Scanner gradeScan = new Scanner(System.in);
            if(gradeScan.hasNextInt())  //checks if entered value is an integer
            {
                gradeInput = gradeScan.nextInt();  //sets a variable for input
                if(gradeInput >= min && gradeInput <= max)  //makes sure it is between the min and max values
                {
                    if(allFif != 0)  //checks if the array isn't at the beginner point, since there is no value before [0]
                    {
                        if(gradeInput >= studentGrades[allFif-1])  //makes sure the entered value is larger than the last one
                        {
                            studentGrades[allFif] = gradeInput;  //sets the array point to the input
                            allFif++;
                        }
                        else{
                            System.out.println("The entered value is not greater than or equal to the previous entered value.");
                        }
                    }
                    else{
                        studentGrades[allFif] = gradeInput;  //since [0] has no value before it we don't have to check for consecutivity
                        allFif++;
                    }
                }
                else{
                    System.out.println("This number is not in the range of " + min + " to " + max + ".");
                }
            }
            else{
                System.out.println("This input is not a valid integer.");
            }
        }
        return studentGrades;  //returns the array so that another array can be set equal to it.
    }
}