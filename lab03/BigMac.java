// Program by Joshua Whitton
// Feb 6th 2015
// CSE2
//
// This program will take user input on how many big macs they are buying, what price they are, and what the tax % is.
// It will then use this information to calculate the totalcost.
import java.util.Scanner;

public class BigMac {
    public static void main(String[] args) { //the main method for the big mac program
        Scanner myScanner; //declares a new scanner object
        myScanner = new Scanner(System.in); //creates the scanner to accept user input
        
        System.out.print("Enter the amount of Big Macs (positive integer): "); //asks the user to input how many big macs are being bought
        int nBigMacs = myScanner.nextInt(); //will take the number entered by user and store it into nBigMacs variable
        
        System.out.print("Enter the cost per Big Mac (in form xx.xx): "); //asks user to input price
        double bigMac$ = myScanner.nextDouble(); //stores double for bigmac price
        
        System.out.print("Enter the sales tax (as a percent): "); //asks user input for tax
        double taxRate = myScanner.nextDouble(); //stores user input for the tax percent
        taxRate /= 100;  //changes the percent to a decimal
        
        double cost$; //declares variable for the total cost
        int dollars, dimes, pennies; //variables for dollars dimes and cents
        
        cost$ = nBigMacs * bigMac$ * (1 + taxRate); //calculates entire price of order
        
        dollars = (int)cost$; //only takes the amount of dollars, the int value is used to do this
        
        dimes = (int)(cost$ * 10) % 10; //takes amount of 10 cents
        pennies = (int) (cost$ * 100) % 10; //takes amount of single cents
        
        System.out.println( nBigMacs + " Big macs are being bought for " + bigMac$ + " each, with a sales tax of "
        + (int)(taxRate * 100)); //displays amount, cost per, and sales tax
        System.out.println("Total cost: " + dollars + '.' + dimes + pennies + "$"); //displays the total price being paid
    }
}