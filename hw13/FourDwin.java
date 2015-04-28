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
        int X = getInput(0);
        System.out.println("Please enter the second parameter of the random array lengths.");
        int Y = getInput(X);
        int YandX = Y-X;
        
        int fourD = 3;
        int threeD = (int)(Math.random() * YandX) + X;
        int twoD = (int)(Math.random() * YandX) + X;
        
        double[][][] fourDArray = new double[fourD][][];  //creates the new double 4D array
        
        int decI = 0;
        double decD = 0;
        
        for(int i = 0; i <fourD; i++)
        {
            fourDArray[i] = new double[(int)(Math.random() * YandX) + X][];  //goes through and sets random lengths to 2nd position
            for(int k = 0; k < fourDArray[i].length; k++)
            {
                fourDArray[i][k] = new double[(int)(Math.random() * YandX) + X];  //sets random lengths to final position
            }
        }
        
        for(int i = 0; i < fourDArray.length; i++)
        {
            for(int k = 0; k < fourDArray[i].length; k++)
            {
                for(int j = 0; j < fourDArray[i][k].length; j++)
                {
                    decI = (int)(Math.random() * 300);  //sets every value to a number from 0 to 300
                    decD = ((double)decI) / 10;  //then makes it a double of that divided by 10.
                    fourDArray[i][k][j] = decD;
                    
                }
            }
        }
        
        printArray(fourDArray);
        statArray(fourDArray);
        sort3DArray(fourDArray);
        printArray(fourDArray);
    }
    
    public static int getInput(int min)  //this checks if user input is correct and takes it for usage.
    {
        int userInput = 0;
        boolean checker = true;
        while(checker)
        {
            Scanner userScan = new Scanner(System.in);
            if(userScan.hasNextInt())
            {
                userInput = userScan.nextInt();
                if(userInput > min)
                {
                    checker = false;
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
    
    public static void sort3DArray(double[][][] list)  //attempts to sort the array
    {
        
        double[][] holder;
        double [] holderTwo;
        double holderThree;
        
        

        
        for(int i = 0; i < list.length; i++)  //this sorts each individual number in the 2D arrays so that they are in order
        {
            for(int k = 0; k < list[i].length; k++)
            {
                for(int j = 0; j < list[i][k].length; j++)
                {
                    if(j+1 < list[i][k].length)
                    {
                        while(j >= 0 && list[i][k][j+1] < list[i][k][j])
                        {
                            holderThree = list[i][k][j];
                            list[i][k][j] = list[i][k][j+1];
                            list[i][k][j+1] = holderThree;
                            if(j != 0)
                            {
                                j--;
                            }
                        }
                    }
                }
            }
        }
        
        
        for(int i = 0; i < list.length; i++)  //this sorts the 3D arrays so that each array in the array of the array is correctly ordered by length
        {
            for(int k = 0; k < list[i].length; k++)
            {
                if(k+1 < list[i].length)
                {
                    if(list[i][k+1].length == list[i][k].length)  //if equal it sets it up so the smallest value one goes first in the order
                    {
                        while(k >= 0 && list[i][k+1][0] < list[i][k][0])
                        {
                            holderTwo = list[i][k];
                            list[i][k] = list[i][k+1];
                            list[i][k+1] = holderTwo;
                            if(k != 0)
                            {
                                k--;
                            }
                        }
                    }
                    while(k >= 0 && list[i][k+1].length < list[i][k].length)  //puts it over if length of another is larger
                    {
                        holderTwo = list[i][k];
                        list[i][k] = list[i][k+1];
                        list[i][k+1] = holderTwo;
                        if(k != 0)
                        {
                            k--;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < list.length; i++)  //an attempt to order it 4D wise.  Was unable to figure out how to get it to work. unfortunately does not order the way it is supposed to, but doesn't have any effect it seems.
        {
            if(i+1 < list.length)
            {
                if(list[i].length == list[i+1].length)
                {
                    for(int k = 0; k < list[i].length - 1; k++)
                    {
                        while(k >= 0 && list[i][k+1][0] < list[i][k][0])
                        {
                            holder = list[i];
                            list[i] = list[i+1];
                            list[i+1] = holder;
                            if(i != 0)
                            {
                                i--;
                            }
                        }
                    }
                }
                while(i >= 0 && list[i+1].length < list[i].length)
                {
                    
                    holder = list[i];
                    list[i] = list[i+1];
                    list[i+1] = holder;
                    if(i != 0)
                    {
                        i--;
                    }
                }
            }
        }
    }
}