//Joshua Whitton
//27th March 2015
//CSE2
//
//The purpose of this lab is to gain practice in methods by creating methods and using random numbers
// to randomly select an adjective-subject-verb-object and string them into a sentence.

import java.util.Random;  //imports Random for use in program

public class labMethods
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++)  //creates a for loop that will run 5 times
        {
            String adjWord = adjOut();
            String subjWord = subjOut();
            String verbWord = verbOut();
            String objWord = objOut();
            String adjTwo = adjOut();  //creates different strings by running methods
            String theSentence = "The " + adjWord + " " + subjWord + " " + verbWord + " the " + adjTwo + " " + objWord + ".";
            System.out.println(theSentence);  //creates a main string and then prints it
        }
    }
    public static String adjOut()  //method that returns a string
    {
        String outPut = "blank";  //set to blank so it compiles
        Random randomGenerator = new Random();  //creates random num generator
        int randomInt = randomGenerator.nextInt(10);  //creates a random integer from 0 to 9
        switch (randomInt)  //switch statement using random number
        {
            case 0:  //cases list out many adjectives for use
                outPut = "quick";
                break;
            case 1:
                outPut = "brown";
                break;
            case 2:
                outPut = "large";
                break;
            case 3:
                outPut = "small";
                break;
            case 4:
                outPut = "smart";
                break;
            case 5:
                outPut = "slow";
                break;
            case 6:
                outPut = "purple";
                break;
            case 7:
                outPut = "interesting";
                break;
            case 8:
                outPut = "happy";
                break;
            case 9:
                outPut = "sad";
                break;
        }
        return outPut;  //returns string
    }
    public static String subjOut()  //method that returns a string
    {
        String outPut = "blank";  //set initially to blank
        Random randomGenerator = new Random();  //RNG
        int randomInt = randomGenerator.nextInt(10);  //random int 0 to 9
        switch (randomInt)  //switch using random int
        {
            case 0:  //lists subjects for use
                outPut = "fox";
                break;
            case 1:
                outPut = "dog";
                break;
            case 2:
                outPut = "cat";
                break;
            case 3:
                outPut = "rock";
                break;
            case 4:
                outPut = "hamster";
                break;
            case 5:
                outPut = "mouse";
                break;
            case 6:
                outPut = "lion";
                break;
            case 7:
                outPut = "train";
                break;
            case 8:
                outPut = "car";
                break;
            case 9:
                outPut = "lamb";
                break;
        }
        return outPut;  //returns string
    }
    public static String verbOut()  //method returning a string
    {
        String outPut = "blank";  //set to blank
        Random randomGenerator = new Random();  //creates RNG
        int randomInt = randomGenerator.nextInt(10);  //creates random int
        switch (randomInt)  //switch using the generated int
        {
            case 0:  //list of verbs for random selection
                outPut = "misunderstood";
                break;
            case 1:
                outPut = "bit";
                break;
            case 2:
                outPut = "passed";
                break;
            case 3:
                outPut = "jumped over";
                break;
            case 4:
                outPut = "talked to";
                break;
            case 5:
                outPut = "looked at";
                break;
            case 6:
                outPut = "ignored";
                break;
            case 7:
                outPut = "touched";
                break;
            case 8:
                outPut = "dodged";
                break;
            case 9:
                outPut = "annoyed";
                break;
        }
        return outPut;  //return string
    }
    public static String objOut()  //method returning a string
    {
        String outPut = "blank";
        Random randomGenerator = new Random();  //creates the random number generator
        int randomInt = randomGenerator.nextInt(10);  //gives int a random value from 0 to 9
        switch (randomInt)
        {
            case 0:  //switch statement takes random int and sets a random obj
                outPut = "lobster";
                break;
            case 1:
                outPut = "boulder";
                break;
            case 2:
                outPut = "giraffe";
                break;
            case 3:
                outPut = "dog";
                break;
            case 4:
                outPut = "frog";
                break;
            case 5:
                outPut = "puppy";
                break;
            case 6:
                outPut = "rabbit";
                break;
            case 7:
                outPut = "wolf";
                break;
            case 8:
                outPut = "rat";
                break;
            case 9:
                outPut = "tree";
                break;
        }
        return outPut;  //returns a string
    }
}