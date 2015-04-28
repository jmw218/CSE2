import java.util.Scanner;
import java.util.Random;

public class test03
{
    public static void main(String[] args)
    {
        int[] tester = new int[10];
        for(int i = 0; i < tester.length; i++)
        {
            tester[i] = i + 1;
        }
        
        for(int i = -10; i <= tester.length+10; i++)
        {
            binarySearch(tester, i);
        }
    }
    public static void binarySearch(int[] array, int find)
    {
        boolean cont = true;
        boolean found = true;
        int mid = 0;
        int low = 0;
        int high = array.length;
        
        while(cont)
        {
            mid = (low + high)/2;
            
            if(mid == low || mid == high)
            {
                cont = false;
            }
            
            if(array[mid] == find)
            {
                cont = false;
                found = false;
                System.out.println(find + " was found within the array.");
            }
            else{
                if(array[mid] > find)
                {
                    high = mid;
                }
                else{
                    low = mid;
                }
            }
        }
        if(found)
        {
            System.out.println(find + " was not found within the array.");
        }
    }
}