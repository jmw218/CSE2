//Joshua Whitton
//Febuary 20th 2015
//CSE2
//
//This program will randomly generate a number for a year, then using switch statements it will
//go through and print all space exploration advances from 2000 up to that year.

public class SpaceExploration
{
    public static void main(String[] args)
    {
        int randomYear = (int)(Math.random() * (10+1)) + 2000; //generates a random number from 2000 to 2010
        
        System.out.println("The year is " + randomYear +"."); //prints the year
        
        switch(randomYear)  //creates switch statement for the year
        {
            //the cases are set up with no break so that it will list all the years before the random year as well
            case 2010:
                System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back.");
            case 2009:
                System.out.println("2009: N/A");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space.");
            case 2007:
                System.out.println("2007: N/A");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet.");
            case 2005:
                System.out.println("2005: Spacecrafr collies with comet.");
            case 2004:
                System.out.println("2004: N/A");
            case 2003:
                System.out.println("2003: Largest infrared telescope released.");
            case 2002:
                System.out.println("2002: N/A");
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid.");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid.");
                break;
        }
    }
}