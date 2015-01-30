//Program by Joshua Whitton
//CSE2
//January 30th 2015
//
//This program will display recorded data from a bicycle cyclometer
//Will display the number of minutes for each trip, the number of counts for each trip,
//the distance of each trip in miles, and the distance of the two trips combined.

public class Cyclometer // create the cyclometer class
{
    public static void main(String[] args) // create the main method for the program
    {
        //variables for cyclometer data
        int secsTrip1 = 480; //The amount of time in seconds that trip 1 takes.
        int secsTrip2 = 3220; //The amount of time in seconds that trip 2 takes.
        int countsTrip1 = 1561; //The amount of counts that occur in trip 1.
        int countsTrip2 = 9037; //The amount of counts in trip 2.
        
        //variables for bicycle data
        double wheelDiameter = 27.0; //The diameter of the bicycle wheel in inches.
        double pi = 3.14159; //A variable to use as pi.
        double feetPerMile = 5280; //The amount of feet in 1 mile.
        double inchesPerFoot = 12; //The amount of inches in a foot.
        double secondsPerMinute = 60; //The amount of seconds in 1 minute.
        double distanceTrip1;
        double distanceTrip2;
        double totalDistance; //The distances for trip 1, 2 and the total of both.
        
        System.out.println("Trip 1 was " + (secsTrip1/secondsPerMinute) + " minutes long and had " +
        countsTrip1 + " counts."); //Prints the minutes and counts for trip 1.
        System.out.println("Trip 2 was " + (secsTrip2/secondsPerMinute) + " minutes long and had " +
        countsTrip2 + " counts."); //Prints the minutes and counts for trip 2.
        
        distanceTrip1 = countsTrip1 * wheelDiameter * pi / (inchesPerFoot*feetPerMile); //calculates the distance of the trips.
        distanceTrip2 = countsTrip2 * wheelDiameter * pi / (inchesPerFoot*feetPerMile);
        totalDistance = distanceTrip1 + distanceTrip2; //gives the total of both trips.
        
        System.out.println("The length of Trip 1 was " + distanceTrip1 + " miles long.");
        System.out.println("The length of Trip 2 was " + distanceTrip2 + " miles long.");
        System.out.println("The total length of both trips was " + totalDistance + " miles long.");
        //prints the length of trip 1 and 2, then gives the total of both.
    }
}