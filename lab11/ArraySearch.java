//Joshua Whitton
//April 10th 2015
//CSE2
//
//Purpose is to practice using linear and binary search on large arrays with random numbers

import java.util.Scanner;

public class ArraySearch
{
    public static void main(String[] args)
    {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        
        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = (int)(100 * (Math.random()));
        }
        
        int maxNum = -1;
        int minNum = 101;
        
        for(int k = 0; k < array1.length; k++)
        {
            if(array1[k] > maxNum)
            {
                maxNum = array1[k];
            }
            if(array1[k] < minNum)
            {
                minNum = array1[k];
            }
        }
        
        System.out.println("Min: " + minNum + "  Max: " + maxNum);
        
        int incRand = 0;
        
        for(int q = 0; q < array2.length; q++)
        {
            incRand += (int)(100 * (Math.random()));
            array2[q] = incRand;
        }
        
        int maxNum2 = -1;
        int minNum2 = 101;
        
        for(int r = 0; r < array2.length; r++)
        {
            if(array2[r] > maxNum2)
            {
                maxNum2 = array2[r];
            }
            if(array2[r] < minNum2)
            {
                minNum2 = array2[r];
            }
        }
        
        System.out.println("Min: " + minNum2 + "  Max: " + maxNum2);
        
        System.out.println("Please enter an integer greater than or equal to 0.");
        Scanner zeroScan = new Scanner(System.in);
        int intInput = 0;
        int binaryVar = 0;
        boolean binaryCheck = true;
        int test = 0;
        if(zeroScan.hasNextInt())
        {
            intInput = zeroScan.nextInt();
            if(intInput >= 0)
            {
                binaryVar = array2.length * (1/2);
                while(binaryCheck)
                {
                    if(array2[binaryVar] == intInput)
                    {
                        if(binaryVar != array2.length)
                        {
                            System.out.println("The number above the key was " + array2[binaryVar+1]);
                        }
                        if(binaryVar != 0)
                        {
                            System.out.println("The number below the key was " + array2[binaryVar-1]);
                        }
                        binaryCheck = false;
                    }
                    else
                    {
                        if(array2[binaryVar] > intInput)
                        {
                            binaryVar += (array2.length - binaryVar) * (1/2);
                        }
                        else{
                            binaryVar -= binaryVar * (1/2);
                        }
                    }
                    System.out.println("tes: " + binaryVar);
                    test++;
                    if(test >= 50)
                    {
                        binaryCheck = false;
                    }
                }
            }
            else{
                System.out.println("Invalid entry.");
            }
        }
        else{
            System.out.println("Invalid entry.");
        }
    }
}