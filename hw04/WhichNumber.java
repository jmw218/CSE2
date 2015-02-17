//Joshua Whitton
//Febuary 17th 2015
//CSE2
//
//This program is used to ask the user to think of an integer that is between 1 and 10.  It then asks various questions in
//an attempt to decipher which number the user was thinking of.

import java.util.Scanner;  //imports scanner

public class WhichNumber
{
    public static void confirmNumber(String confirmInput)  //creates a function for use in the main program
    {
        String yesInput = "yes";  //variable for yes
        String noInput = "no";  //variable for no
        if(confirmInput.equals(yesInput))
        {
            System.out.println("Yay!");  //if they said yes, responds with yay
        }
        else{
            if(confirmInput.equals(noInput))  //otherwise it checks if they put no
            {
                System.out.println("This is inconsistent with your responses.");  //and tells them this is inconsistent
            }
            else{ System.out.println("Your input is invalid."); } //if it isn't yes or no, prints invalid.
        }
    }
    public static void main(String[] args)
    {
        Scanner whichScanner;
        whichScanner = new Scanner(System.in);
        
        String userInput = "empty"; //sets up an empty string for user input
        
        String yesVariable = "yes";
        String noVariable = "no"; //makes variables that can be used for yes and no
        
        System.out.println("Consider a number from 1 to 10."); //asks user to think of a number
        
        System.out.println("Is this number even? (yes/no)");  //asks if the number is even
        userInput = whichScanner.nextLine(); //takes user input
        if(userInput.equals(yesVariable)) //if they say yes it moves on
        {
            System.out.println("Is this number divisble by 3? (yes/no)");  //asks if the number is divisible by 3
            userInput = whichScanner.nextLine();
            if(userInput.equals(yesVariable)) //if they say yes it keeps going
            {
                System.out.println("Is your number 6?"); //asks if the number is 6
                userInput = whichScanner.nextLine();
                confirmNumber(userInput);  //uses previously made function to confirm the user input.
            }
            else{
                if(userInput.equals(noVariable))  //if they said no to being divisible by 3
                {
                    System.out.println("Is the number divisible by 4? (yes/no)");
                    userInput = whichScanner.nextLine();
                    if(userInput.equals(yesVariable))  //asks if divisible by 4
                    {
                        System.out.println("Is the number greater than 1 when divided by 4? (yes/no)");
                        userInput = whichScanner.nextLine();
                        if(userInput.equals(yesVariable))  //asks if the number is greater than 1 after divided by 4
                        {
                            System.out.println("Is your number 8? (yes/no)");
                            userInput = whichScanner.nextLine();
                            confirmNumber(userInput);  //uses function to ask if number is 8
                        }
                        else{
                            if(userInput.equals(noVariable))  //if it isn't greater than 1 when divided by 4, asks if number is 4
                            {
                                System.out.println("Is your number 4? (yes/no)");
                                userInput = whichScanner.nextLine();
                                confirmNumber(userInput);
                            }
                            else{
                                System.out.println("The user input is invalid.");  //tells user input is invalid
                            }
                        }
                    }
                    else{
                        if(userInput.equals(noVariable))  //if they said no when asked if divisible by 4
                        {
                            System.out.println("Is your number divisible by 5? (yes/no)");
                            userInput = whichScanner.nextLine();
                            if(userInput.equals(yesVariable))  //asks if divisible by 5
                            {
                                System.out.println("Is your number 10? (yes/no)");
                                userInput = whichScanner.nextLine();
                                confirmNumber(userInput);   //confirms if number is 10
                            }
                            else{
                                if(userInput.equals(noVariable))  //if it isn't divisible by 5
                                {
                                    System.out.println("Is your number 2? (yes/no)");
                                    userInput = whichScanner.nextLine();
                                    confirmNumber(userInput);  //asks if number is 2
                                }
                                else{
                                    System.out.println("The user input is invalid.");  //if input is invalid
                                }
                            }
                        }
                        else{
                            System.out.println("The user input is invalid."); //if input is invalid
                        }
                    }
                }
                else{
                    System.out.println("The user input is invalid.");  //if invalid input
                }
            }
        }
        else{
            if(userInput.equals(noVariable))  //if the number isn't even
            {
                System.out.println("Is it divisible by 3? (yes/no)");
                userInput = whichScanner.nextLine();
                if(userInput.equals(yesVariable))  //asks if divisible by 3
                {
                    System.out.println("Is the number greater than 1 when divided by 3? (yes/no)");
                    userInput = whichScanner.nextLine();
                    if(userInput.equals(yesVariable))  //asks if greater than 1 when divided by 3
                    {
                        System.out.println("Is your number 9? (yes/no)");
                        userInput = whichScanner.nextLine();
                        confirmNumber(userInput);  //confirms if the number is 9
                    }
                    else{
                        if(userInput.equals(noVariable))  //if the number isn't greater than 1 when divided by 3
                        {
                            System.out.println("Is your number 3? (yes/no)");
                            userInput = whichScanner.nextLine();
                            confirmNumber(userInput);  //confirms if the number is 3
                        }
                        else{
                            System.out.println("The user input is invalid.");  //invalid input
                        }
                    }
                }
                else{
                    if(userInput.equals(noVariable))  //if the number isn't divisible by 3
                    {
                        System.out.println("Is the number greater than 6? (yes/no)");
                        userInput = whichScanner.nextLine();
                        if(userInput.equals(yesVariable))  //checks if greater than 6
                        {
                            System.out.println("Is your number 7? (yes/no)");
                            userInput = whichScanner.nextLine();
                            confirmNumber(userInput);  //confirms if 7
                        }
                        else{
                            if(userInput.equals(noVariable))  //number isn't greater than 6
                            {
                                System.out.println("Is the number less than 3? (yes/no)");
                                userInput = whichScanner.nextLine();
                                if(userInput.equals(yesVariable))  //asks if less than 3
                                {
                                    System.out.println("Is your number 1? (yes/no)");
                                    userInput = whichScanner.nextLine();
                                    confirmNumber(userInput);  //confirms if number is 1
                                }
                                else{
                                    if(userInput.equals(noVariable))  //if the number isn't less than 3
                                    {
                                        System.out.println("Is your number 5? (yes/no)");
                                        userInput = whichScanner.nextLine();
                                        confirmNumber(userInput);  //confirms if number is 5
                                    }
                                    else{
                                        System.out.println("The user input is invalid.");  //invalid input
                                    }
                                }
                            }
                            else{
                                System.out.println("The user input is invalid.");  //invalid input
                            }
                        }
                    }
                    else{
                        System.out.println("The user input is invalid.");  //invalid input
                    }
                }
            }
            else{
                System.out.println("The user input is invalid.");  //invalid input
            }
        }
    }
}