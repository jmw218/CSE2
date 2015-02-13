//Joshua Whitton
//Feb 13th 2015
//cse2
//
//Cookies program.  Ask user how many cookies to buy, how many for each person, and display if we'll have enough.

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args){
        Scanner cookieScanner;
        cookieScanner = new Scanner(System.in); //sets up scanner for user input
        int peopleThere;
        int buyCookies;
        int cookiesEach; //create variables for later use
        
        int peopleTester = 0;
        System.out.print("How many people are there: ");
        if(cookieScanner.hasNextInt()){ //gets the user input and checks if its an int
            peopleTester = cookieScanner.nextInt(); //sets up a variable for the int so that it can check for positivity
            if(peopleTester > 0){  //checks if int is positive
                peopleThere = peopleTester;  //takes the positive int and sets it up in the main variable for people there
            }
            else{ 
                System.out.println("You did not enter a positive integer.");  //else return program with message
                return;
            }
        }
        else{ 
            System.out.println("You did not enter an integer."); //else return the program
            return;
        }
        
        int buyTester = 0;
        System.out.print("How many cookies to buy: ");
        if(cookieScanner.hasNextInt()){  //checks if an int was entered
            buyTester = cookieScanner.nextInt();
            if(buyTester > 0){          //checks if it is positive
                buyCookies = buyTester;  //sets up number in correct variable position
            }
            else{ 
                System.out.println("You did not enter a positive integer.");  //else return program
                return;
            }
        }
        else{ 
            System.out.println("You did not enter an integer."); //else return program
            return;
        }
        
        int eachTester = 0;
        System.out.print("How many cookies each: ");
        if(cookieScanner.hasNextInt()){   //checks if an int was entered
            eachTester = cookieScanner.nextInt();
            if(eachTester > 0){  //makes sure the int is positive
                cookiesEach = eachTester;  
            }
            else{ 
                System.out.println("You did not enter a positive integer.");  //else return program
                return;
            }
        }
        else{ 
            System.out.println("You did not enter an integer.");  //else returns the program
            return;
        }
        
        if(buyCookies >= (peopleThere * cookiesEach))
        {
            System.out.println("There are enough cookies for everyone.");  //if the amount of cookies bought is greater than or equal
        }                                                               //to the cookies that will be eaten (people * cookies each), then print that there are enough
        else{ 
            System.out.println("There are not enough cookies for everyone.");  //else print there aren't enough
        }
    }
}