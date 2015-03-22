//Joshua Whitton
//March 22nd 2015
//CSE2
//
//Take a pre-written main method and create the methods stated inside of it in order to make the program run correctly.

import java.util.Scanner;

public class HW8
{
    
    public static void main(String[] args)
    {
        char option;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

        String input = getInput(scan, "Cc");

        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

        input = getInput(scan, "Cc");

        System.out.println("You walked and walked and walked and you saw a cave!");

        cave();

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

        input = getInput(scan, "Cc");

        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

        input = getInput(scan, "Cc");

        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();

        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");

        input = getInput(scan, "AaEe", 10);

        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");

        box();

        input = getInput(scan);

        System.out.println("Hero! Have a good day!");
    }
public static void giant()
    {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    public static void cave()
    {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    public static void box()
    {
        System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    public static String getInput(Scanner scan, String string)
    {
        String isItC = scan.nextLine();  //string value for the input
        if(isItC.equals("c") || isItC.equals("C")) //checks if the user has entered c or C
        {
            return string; //moves onwards
        }
        else{
            System.out.println("Yea right LOSER!");
            System.exit(0);  //if they didn't enter c or C, it cancels the program
        }
        return string;//just to make sure it actually compiles
    }
    public static String getInput(Scanner scan, String string, int trial)
    {
        String theEntry = scan.nextLine(); //sets up a string for the input
        if(theEntry.equals("A") || theEntry.equals("a"))  //checks if A or a
        {
            int critCheck = (int)((2*Math.random()));  //random number, either 0 or 1.
            if(critCheck == 1)  //if 1 it does a hit
            {
                System.out.println("You hit the troll!");
                trial--;  //subtracts from the total hits remaining
            }
            else{
                System.out.println("You missed the troll.");  //tells if you missed
            }
            if(trial == 0)
            {
                System.out.println("The troll has been slain!");  //once remainder hits 0 tells you of victory and returns
                return string;
            }
            else{
                System.out.println(trial + " more hits until the troll is dead. Choose between 'A' 'a' 'e' or 'E' again.");  //if it isn't dead yet, tells you how many more hits, and repeats getInput
                getInput(scan, string, trial);
            }
        }
        else{
            if(theEntry.equals("E") || theEntry.equals("e"))
            {
                int escapeNum = (int)Math.floor((Math.random() * 10) + 1);  //random number from 1 to 10
                if(escapeNum == 10)  //if you get 10
                {
                    System.out.println("You manage to escape.");
                    return string;  //returns when you actually get 10, you win.
                }
                else{
                    System.out.println("You failed to escape.  Choose between 'A' 'a' 'e' or 'E' again.");  //otherwise you try again
                    getInput(scan, string, trial);  //does getinput again
                }
            }
            else{
                System.out.println("Executed by the GIANT! Game Over!");  //if you don't enter A a e or E, you die.
                System.exit(0);  //terminates program.
            }
        }
        return string;  //return placed so it compiles correctly.
    }
    public static String getInput(Scanner scan)
    {
        String userChest = scan.nextLine();  //string variable for input
        switch(userChest)
        {
            case "1":  //if the line was 1
                System.out.println("Inside the chest is a pile of gold coins and jewelery!");
                break;
            case "2":  //if the line was 2
                System.out.println("You find an elixir of immortality within the chest.");
                break;
            case "3":  //if 3
                System.out.println("You find a large enchanted sword inside the 3rd chest.");
                break;
            default:  //if entry wasn't any of the above.
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                break;
        }
        return userChest;  //required return statement to main method.
    }
}