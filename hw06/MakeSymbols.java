//Joshua Whitton
//27th Febuary 2015
//CSE2
//
//Program 3 - Using do while loops, print a random number from 0 to 100, then, if the number is an even number,
//the program will print out that many "*" symbols, if it is odd it will print out that many "&" characters.

public class MakeSymbols
{
    public static void main(String[] args)
    {
        int randomNum = (int)(Math.random() * 101);  //creates a random integer from 0 to 100.
        
        int whileStopper = 0;  //sets up a variable for stopping the loop
        randomNum = 10;
        System.out.println("The randomly generated number is: " + randomNum);
        if(randomNum % 2 == 0)  //checks if the remainder after dividing by 2 is 0, if so, is even.
        {
            do {
                System.out.print("*");
                whileStopper++;
            } while(whileStopper < randomNum);  //a do while statement which prints *'s and increases the stopper by 1.
        }
        else{  //does this if the number is odd.
            do {
                System.out.print("&");
                whileStopper++;
            } while(whileStopper < randomNum);  //do while statement which prints &'s and increases stopper by 1.
        }
        System.out.println(""); //just makes a new line for next usage of the terminal.  Not really neccessary.
    }
}