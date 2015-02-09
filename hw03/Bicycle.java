//Joshua Whitton
//Febuary 9th 2015
//CSE2
//
//Program 1
//Ask the user to give values for the number of counts on a cyclometer and for the number
//of seconds it took for these counts to go by.
import java.util.Scanner; //imports the scanner for taking input

public class Bicycle  //the class
{
    public static void main(String[] args) //Creating the program's main method
    {
        Scanner bikeScanner;
        bikeScanner = new Scanner(System.in);  //create the bike scanner to get values
        
        //use variables for calculations just like in Cyclometer program.
        double wheelDiameter = 27.0; //the inch diameter of the wheel
        double inchesPerFoot = 12; //how many inches in a foot
        double pi = 3.14159; //the value of pi for use in calculations
        double feetPerMile = 5280; //how many feet in a single mile
        double secondsPerMinute = 60; //There are 60 seconds in one minute
        
        //various variables for later use
        double tripMinutes;
        double tripMiles;
        double tripMPH;
        
        System.out.print("How many seconds was the bicycle ride: ");  //asks user to input seconds
        int tripTime = bikeScanner.nextInt(); //takes input and adds to variable tripTime
        
        System.out.print("How many counts on cyclometer: "); //asks for counts
        int tripCounts = bikeScanner.nextInt(); //takes input for tripCounts
        
        tripMinutes = tripTime / secondsPerMinute; //calculates minutes of travel time
        tripMiles = tripCounts * wheelDiameter * pi / (inchesPerFoot * feetPerMile);  //calculates the distance traveled
        
        tripMPH = tripMiles / (tripMinutes / 60); // calculates the miles per hour
        
        System.out.println("The distance traveled was: " + tripMiles + " miles.");
        System.out.println("The trip took " + tripMinutes + " minutes to complete.");
        System.out.println("The average mph during the trip was: " + tripMPH); //These print out the various data
    }
}