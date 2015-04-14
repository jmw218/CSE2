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
        System.out.println("Minimum and Maximum of array 1.");
        maxMin(array1);
        
        int incRand = 0;
        
        for(int q = 0; q < array2.length; q++)
        {
            incRand += (int)(100 * (Math.random()));
            array2[q] = incRand;
        }
        System.out.println("Minimum and Maximum of array 2.");
        maxMin(array2);
        
        System.out.println("Please enter an integer greater than or equal to 0.");
        Scanner binaryScan = new Scanner(System.in);
        if(binaryScan.hasNextInt())
        {
            int targetNum = binaryScan.nextInt();
            if(targetNum >= 0)
            {
                binarySearch(array2, targetNum);
            }
            else{
                System.out.println("You did not enter an integer greater than or equal to 0.");
            }
        }
        else{
            System.out.println("You did not enter an integer.");
        }
    }
    
    public static void maxMin(int[] list)
    {
        int maxNumber = -1;
        int minNumber = 101;
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > maxNumber)
            {
                maxNumber = list[i];
            }
            if(list[i] < minNumber)
            {
                minNumber = list[i];
            }
        }
        System.out.println("Minimum of the array: " + minNumber + "  Maximum of the array: " + maxNumber);
    }
    
    public static void binarySearch(int[] list, int search)
    {
        int high = list.length;
        int low = 0;
        int mid = 0;
        boolean found = false;
        boolean cont = true;
        
        while(cont)
        {
            mid = (high + low)/2;
            if(mid == high || mid == low)
            {
                cont = false;
            }
            if(list[mid] == search)
            {
                System.out.println(search + " was found in the array.");
                low = mid;
                high = mid;
                found = true;
                cont = false;
            }
            else{
                if(list[mid] > search)
                {
                    high = mid;
                }
                else{
                    low = mid;
                }
            }
            
        }
        if(!found)
        {
            System.out.println(search + " was not found in the array.");
            System.out.println("The number above the key was: " + list[mid + 1]);
            System.out.println("The number below the key was: " + list[mid]);
        }
    }
    
}