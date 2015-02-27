//Joshua Whitton
//Febuary 27th 2015
//CSE2
//
//This program is about experimenting with different looping methods in order to
//create smiley faces.

public class SmileGenerator
{
    public static void main(String[] args)
    {
        //Step 1 - Using for loops (non-nested), while loops, and do-while loops, print 5 smiley faces (for each)
        for(int n = 0; n < 5; n++)  //for statement, repeats 5 times.
        {
            System.out.print(":) "); //smiley printing
        }
        System.out.println(""); //makes sure next input will be on a new line
        
        int smileyLimiter = 0;  //creates a variable for the while statement to use
        while(smileyLimiter < 5)  //will go while variable is less than 5
        {
            System.out.print(":) ");  //smiley printing
            smileyLimiter++;  //keeps increasing variable by 1 after each run
        }
        System.out.println(""); //sets up new line
        
        int smileyDoWhile = 0;  //sets a variable for the do while
        do {  //starts the do statement
            System.out.print(":) ");  //prints smileys
            smileyDoWhile++;  //increases variable by 1
        } while (smileyDoWhile < 5);  //checks after if it should stop running
        System.out.println("");
        
        //Step 2 - A second loop which prints out smiley faces, but this time a random amount between 1 and 100.
        
        int smileRandom = (int)(Math.random() * 100) + 1; //will generate a number from 1 to 100
        System.out.println("Now printing " + smileRandom + " smileys.");
        int smileStopper = 0; //variable for while loop
        while(smileStopper < smileRandom) //checks that the smile stopper variable is less than random number
        {
            System.out.print(":) "); //prints smiley
            smileStopper++; //increases the stopper
        }
        System.out.println(""); //starts new line
        
        //Step 3 - Do the same, but this time make a new line after every 30 smiley faces.
        
        int thirtySmileRandom = (int)(Math.random() * 100) + 1; //randomly generated number from 1 to 100
        System.out.println("Now printing " + thirtySmileRandom + " smileys.");
        int thirtySmileStopper = 0; //variable to stop the while loop
        while(thirtySmileStopper < thirtySmileRandom) //makes sure that the variable is less than the randomized number
        {
            System.out.print(":) "); //prints smiley
            thirtySmileStopper++; //increases the variable to stop the while loop at some point
            if(thirtySmileStopper % 30 == 0)
            {
                System.out.println("");  //if 30 smiles have been printed it starts a new line
            }
        }
        System.out.println(""); //starts a new line
        
        //Step 4 - Make it so that the line has an increasing amount of smileys on it by 1.
        
        int pyramidRandom = (int)(Math.random() * 100) + 1; //Creates number from 1 to 100 at random
        System.out.println("Now printing " + pyramidRandom + " smileys.");
        int pyramidStopper = 0; //Will stop the loop at some point
        int pyramidMaker = 1;  //variable for creating staircase or pyramid shape
        int pyramidIncreaser = 1;  //makes sure pyramid maker has a reference
        while(pyramidStopper < pyramidRandom) //keeps while going until correct amount is printed
        {
            System.out.print(":) "); //prints smiley
            pyramidStopper++; //increases the stopping variable
            if(pyramidMaker == pyramidIncreaser) //checks if maker is equal to increase
            {
                System.out.println("");  
                pyramidIncreaser++;  //increaser increases so that after each loop run the amount will be bigger
                pyramidMaker = 0;  //resets maker to 0 so that it won't just print a seperate line each time
            }
            pyramidMaker++;  //increases the pyramid maker so that it will reach the correct point sometime
        }
        System.out.println(""); //starts a new line
    }
}