//Joshua Whitton
//Febuary 9 2015
//CSE2
//
//Program 3
//The user enters a double and the program then prints out the first four digits that are to the right of the decimal point
import java.util.Scanner; //sets up the java utility for scanner

public class FourDigits  //the class for four digits
{
    public static void main(String[] args) // the main method of the four digits program
    {
        Scanner digitScanner;
        digitScanner = new Scanner(System.in);  //the scanner to use for getting the user input
        
        System.out.print("Enter a positive double value to get the first four digits to the right of the decimal point: ");
        double theNumber = Math.abs(digitScanner.nextDouble());  // gets a double value to use as the number to find four digits
        
        int leftDigits = (int) theNumber * 10000;  //moves the number by 4 decimal places
        int rightDigits = ((int) (theNumber * 10000)) - leftDigits; //uses previous variable to cut off the last 4 numbers and get the four digits we are looking for
        
        if(rightDigits > 999){
        System.out.println("The four digits are: " + rightDigits);  //if it is over 999, then it must be from 9999 to 1000, so all 4 digits are there
        }
        else{
            if(rightDigits > 99){
                System.out.println("The four digits are: 0" + rightDigits); //in this else, it must be from 999 to 100, so only 3 digits, meaning a 0 must be added to the beginning
            }
            else{
                if(rightDigits > 9){
                    System.out.println("The four digits are: 00" + rightDigits); //add 00 to beginning because only from 99 to 10.
                }
                else{
                    System.out.println("The four digits are: 000" + rightDigits); //add 000 to beginning because it only goes from 9 to 0.
                }
            }
        }
    }
}