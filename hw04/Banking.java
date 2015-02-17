//Joshua Whitton
//Febuary 17th 2015
//CSE2
//
//Use switch statements in order to allow a user to deposit, withdraw, or view the money in a bank account.
//the money is randomized.

import java.util.Scanner;
import java.util.Random;  //imports scanner and random for use in program

public class Banking
{
    public static void main(String[] args)
    {
        Scanner bankScanner;
        bankScanner = new Scanner(System.in);  //creates the scanner
        
        Random randGen = new Random();  //creates the random number generator
        int randomMoney = randGen.nextInt(5000-1000) + 1000;  //generates a number inbetween 1000 and 5000
        
        int userAmountInput = 0; //sets a variable up for taking integer input
        
        String userStringInput = "empty";  //a variable for taking String input
        
        System.out.println("Would you like to deposit, withdraw, or view the balance of your bank account? (deposit, withdraw, or balance)");
        userStringInput = bankScanner.nextLine();  //takes user string input
        if(userStringInput.equals("deposit") || userStringInput.equals("withdraw") || userStringInput.equals("balance"))
        { //this makes sure the user uses correct input
            switch(userStringInput)
            {
                case "deposit":  //the deposit case
                    System.out.println("How much would you like to deposit?");  
                    userAmountInput = bankScanner.nextInt();
                    if(userAmountInput > 0)  //makes sure number is positive
                    {
                        System.out.println("The money has been deposited.");
                        System.out.println("The resulting balance is " + (randomMoney + userAmountInput)); //prints new balance
                    }
                    else{
                        System.out.println("Please input an integer greater than zero.");  //informs you if number is less than 0
                    }
                    break;
                case "withdraw": //withdraw case
                    System.out.println("How much would you like to withdraw?");
                    userAmountInput = bankScanner.nextInt();
                    if(userAmountInput > 0 && randomMoney >= userAmountInput)  //makes sure money to withdraw is positive and less than or equal to current balance
                    {
                        System.out.println("The money has been withdrawn.");
                        System.out.println("The resulting balance is " + (randomMoney - userAmountInput));  //prints new balance
                    }
                    else{  //informs user if number is too high or too low
                        System.out.println("Please input an integer that is greater than zero and less than your balance.");
                    }
                    break;
                case "balance":
                    System.out.println("You have a balance of: " + randomMoney);  //shows the balance of user
                    break;
            }
        }
        else{  //if input is incorrect it tells user that
            System.out.println("Invalid input.  Try 'deposit' 'withdraw' or 'balance'");
        }
    }
}