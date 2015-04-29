//Joshua Whitton
//April 28th 2015
//CSE2
//
//Create a 4D ragged array with random doubles from 0 to 30 throughout it.  The main array is only 3 long, while the others are random inbetween two user input integers.

import java.util.Scanner;
import java.util.Random;

public class FourDwin
{
    public static void main(String[] args)
    {
        System.out.println("Please enter the first parameter of the random array lengths.");
        int X = getInput(0); //method made to get input and continuously try until the user enters it correctly.  The entry into this method is the minimum value.
        System.out.println("Please enter the second parameter of the random array lengths.");
        int Y = getInput(X); //sets value of X to the minimum Y can be chosen as.
        int YandX = Y-X;  //necessary for the randomized element later.  Makes it random from 0 to Y-X.
        
        int fourD = 3;
        int threeD = (int)(Math.random() * YandX) + X;
        int twoD = (int)(Math.random() * YandX) + X;
        
        double[][][] fourDArray = new double[fourD][][];  //creates the new double 4D array
        
        int decI = 0;
        double decD = 0;
        
        for(int i = 0; i <fourD; i++)
        {
            fourDArray[i] = new double[(int)(Math.random() * YandX) + X][];  //goes through and sets random length from X to Y
            for(int k = 0; k < fourDArray[i].length; k++)
            {
                fourDArray[i][k] = new double[(int)(Math.random() * YandX) + X];  //sets random lengths to final position from X to Y
            }
        }
        
        for(int i = 0; i < fourDArray.length; i++)
        {
            for(int k = 0; k < fourDArray[i].length; k++)
            {
                for(int j = 0; j < fourDArray[i][k].length; j++)
                {
                    decI = (int)(Math.random() * 300);  //sets every value to a number from 0 to 300
                    decD = ((double)decI) / 10;  //then makes it a double of that divided by 10.  Ex: 298 becomes 29.8
                    fourDArray[i][k][j] = decD;
                    
                }
            }
        }
        
        printArray(fourDArray); //prints, gets stats, sorts it, and then prints the final results.
        statArray(fourDArray);
        sort4DArray(fourDArray);
        printArray(fourDArray);
    }
    
    public static int getInput(int min)  //this checks if user input is correct and takes it for usage.
    {
        int userInput = 0;
        boolean checker = true;
        while(checker)  //keeps going until user correctly enters
        {
            Scanner userScan = new Scanner(System.in);
            if(userScan.hasNextInt())
            {
                userInput = userScan.nextInt();
                if(userInput > min)
                {
                    checker = false;  //causes loop to end and to return input
                }
                else{
                    System.out.println("The value you entered is not greater than the minimum of " + min + ".");
                }
            }
            else{
                System.out.println("The entry is not a valid integer.");
            }
        }
        return userInput;
    }
    
    public static void printArray(double[][][] array)
    {
        System.out.println("{");
        for(int i = 0; i < array.length; i++)  //goes through every dimension of the array and prints it in the correct format.
        {
            System.out.println("     { ");
            for(int k = 0; k < array[i].length; k++)
            {
                System.out.print("          {{ ");
                for(int j = 0; j < array[i][k].length; j++)
                {
                    System.out.print(" " + array[i][k][j] + ", ");
                }
                System.out.print("}}");
            }
            System.out.println();
            System.out.println("     },");
        }
        System.out.println("}");
    }
    
    public static void statArray(double[][][] array)  //gets the stats from the array
    {
        double memCount = 0;
        double arraySum = 0;
        double arrayMean = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int k = 0; k < array[i].length; k++)
            {
                for(int j = 0; j < array[i][k].length; j++)
                {
                    memCount++;  //adds up for every one value
                    arraySum += array[i][k][j];  //adds that value onto a whole sum.
                }
            }
        }
        arrayMean = arraySum / memCount;  //calculates mean using other data
        System.out.println("Members: " + memCount);
        System.out.println("Sum: " + arraySum);
        System.out.println("Mean: " + arrayMean);
    }
    
    public static void sort4DArray(double[][][] list)  //attempts to sort the array
    {
        
        double[][] holder;
        double [] holderTwo;
        double holderThree;
        
        int counter = 0;
        int prevCount = 0;
        int curI = 0;
        int curK = 0;
        int prevI = 0;
        int prevK = 0;
        double minNum = 1000;  //used while finding min number in each 3D array
        double prevMin = 0;  //the previous minimum
        
        for(int i = 0; i < list.length; i++)
        {
            for(int k = 0; k < list[i].length; k++)
            {
                for(int j = 0; j < list[i][k].length; j++)
                {
                    counter++;
                    if(list[i][k][j] < minNum)
                    {
                        minNum = list[i][k][j];  //this continuously gets the min number for each 3Darray
                    }
                }
                
            }
            curI = i;
            
            if(prevCount > counter)
            {
                holder = list[curI];
                list[curI] = list[prevI];  //swaps values if the number of members in a previous spot is higher.
                list[prevI] = holder;
                
                
                i = -1;  //resets i to -1 so it does another full cycle to prevent misses.
            }
            else{
                if(prevCount == counter) //it checks if the two are equal.
                {
                    if(prevMin > minNum)
                    {
                        holder = list[curI];
                        list[curI] = list[prevI];  //if so, it checks which has the lower min and then swaps them if necessary
                        list[prevI] = holder;
                        
                        
                        i = -1;  //resets to 0 so it can re-check everything.
                    }
                }
            }
            
            
            prevCount = counter;  //sets the previouses' before repeat of loop
            prevMin = minNum;
            
            counter = 0; //resets the counters
            minNum = 1000;
            prevI = curI;
            
        }
        
        sort3DArray(list);
        
    }
    
    public static void sort3DArray(double[][][] list)
    {
        double holder;
        int curJ;
        int lowJ;
        int lower;
        boolean stopper = true;
        
        for(int i = 0; i < list.length; i++)
        {
            for(int k = 0; k < list[i].length; k++)
            {
                for(int j = 0; j < list[i][k].length; j++)
                {
                    curJ = j;
                    lowJ = j;
                    lower = j;
                    while(lowJ < list[i][k].length)  //goes through every value above the current one and checks if it is lower.
                    {
                        if(list[i][k][lowJ] < list[i][k][curJ] && list[i][k][lowJ] < list[i][k][lower])  //if it is lower, sets it to the lowest value
                        {
                            lower = lowJ;
                        }
                        lowJ++;
                    }
                    holder = list[i][k][curJ];  //swaps the current value with the lowest one.
                    list[i][k][curJ] = list[i][k][lower];
                    list[i][k][lower] = holder;
                }
            }
        }
    }
}