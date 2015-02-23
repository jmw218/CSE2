//Joshua Whitton
//23rd Febuary 2015
//CSE2
//
//Create a program that converts decimal numbers into hexadecimal numbers.  In this case we will take input values for color (0-255) and convert it to hexadecimal.

import java.util.Scanner;

public class ToHex
{
    public static String decToHex(int decNum)  //creates a function which takes a decimal value and returns a string.
    {
        String hexNumOne = "empty";
        String hexNumTwo = "empty";
        String finalHex = "empty";  //3 string variables initially set to empty
        
        int firstPart = decNum % 16;  //Gets the remainder of the number divided by 16.
        int secondPart = (decNum - firstPart) / 16;  //gets the value of the number minus the remainder from before, and divides it by 16.
        
        if(firstPart < 10)  //if the number is less than 10, it is simply set to a String of itself.
        {
            hexNumOne = "" + firstPart;
        }
        else{
            switch(firstPart)  //if it isn't less than 10, it sets it to the appropriate Hexadecimal value.
            {
                case 10:
                    hexNumOne = "A";
                    break;
                case 11:
                    hexNumOne = "B";
                    break;
                case 12:
                    hexNumOne = "C";
                    break;
                case 13:
                    hexNumOne = "D";
                    break;
                case 14:
                    hexNumOne = "E";
                    break;
                case 15:
                    hexNumOne = "F";
                    break;
            }
        }
        
        if(secondPart < 10)  //sets to itself as a string if less than 10.
        {
            hexNumTwo = "" + secondPart;
        }
        else{
            switch(secondPart)  //sets to correct hexadecimal value if greater than 10.
            {
                case 10:
                    hexNumTwo = "A";
                    break;
                case 11:
                    hexNumTwo = "B";
                    break;
                case 12:
                    hexNumTwo = "C";
                    break;
                case 13:
                    hexNumTwo = "D";
                    break;
                case 14:
                    hexNumTwo = "E";
                    break;
                case 15:
                    hexNumTwo = "F";
                    break;
            }
        }
        
        finalHex = hexNumTwo + hexNumOne;  //puts the numbers in the correct order in a single string.
        return finalHex;  //returns the String for usage
    }
    
    public static void main(String[] args)
    {
        Scanner decScan = new Scanner(System.in);  //creates scanner to get color input
        
        int redValue = 0;
        int greenValue = 0;
        int blueValue = 0;  //creates integers for the color input
        
        String redHex = "empty";
        String greenHex = "empty";
        String blueHex = "empty";  //creates strings to later represent hexadecimal values.
        
        System.out.println("We will now ask for RGB values: ");
        System.out.println("Please enter a value for Red. (0-255)");  //asks for input from 0-255 for red
        if(decScan.hasNextInt())  //makes sure an integer is entered
        {
            redValue = decScan.nextInt();
            if(redValue < 0 || redValue > 255)  //if the int is less than 0 or greater than 255 it ends the program.
            {
                System.out.println("Please make sure the value is from 0 to 255.");
                return;
            }
        }
        else{
            System.out.println("Please make sure the input is an integer.");  //if it isn't an integer ends the program.
            return;
        }
        
        System.out.println("Please enter a value for Green. (0-255)");
        if(decScan.hasNextInt())
        {
            greenValue = decScan.nextInt();
            if(greenValue < 0 || greenValue > 255) //same for red but with green
            {
                System.out.println("Please make sure the value is from 0 to 255.");
                return;
            }
        }
        else{
            System.out.println("Please make sure the input is an integer.");
            return;
        }
        
        System.out.println("Please enter a value for Blue. (0-255)");
        if(decScan.hasNextInt())
        {
            blueValue = decScan.nextInt();
            if(blueValue < 0 || blueValue > 255)  //same stuff for red but for blue
            {
                System.out.println("Please make sure the value is from 0 to 255.");
                return;
            }
        }
        else{
            System.out.println("Please make sure the input is an integer.");
            return;
        }
        
        redHex = decToHex(redValue);
        greenHex = decToHex(greenValue);
        blueHex = decToHex(blueValue);  //uses the function created earlier to set up the hexadecimal String representatives.
        
        System.out.println("The color in Hexadecimal: " + redHex + greenHex + blueHex);  //Prints out the hexadecimal.
    }
}