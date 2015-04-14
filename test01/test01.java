import java.util.Scanner;

public class test01
{
    public static void main(String[] args)
    {
        int[] array1 = new int[200];
        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = i;
        }
        printArray(array1);
        for(int k = 0; k < array1.length; k++)
        {
            binarySearch(array1, k);
        }
    }
    
    public static void printArray(int[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");  //goes through and prints out every value from the array
        }
        System.out.println();
    }
    
    public static void binarySearch(int[] studentGrades, int searchInput)
    {
        int upper = studentGrades.length - 1;
        int lower = 0;
        int binCheck = (upper/2) + (lower/2);  
        int tripCount = 0;
        boolean continueCheck = true;
        int failureCount = 0;
        
        while(continueCheck)
        {
            if(studentGrades[binCheck] == searchInput)
            {
                tripCount++;
                System.out.println(searchInput + " was found, there were " + tripCount + " iterations.");
                continueCheck = false;
            }
            else{
                
                if(lower == binCheck || upper == binCheck)
                {
                    if(failureCount == 1)
                    {
                        continueCheck = false;
                        System.out.println(searchInput + " was not found in the list, there were " + tripCount + " iterations.");
                    }
                    failureCount++;
                }
                
                tripCount++;
                
                if(tripCount > 15)
                {
                    continueCheck = false;
                    System.out.println("The ");
                }
                
                if(studentGrades[binCheck] > searchInput)
                {
                    upper = binCheck;
                    
                    binCheck = (upper/2) + (lower/2);
                }
                
                else{
                    lower = binCheck;
                    
                    binCheck = (upper/2) + (lower/2) + 1;
                }
            }
            
        }
    }
    
    public static void arrayScrambler(int[] studentGrades)
    {
        int newRan = 0;
        int placeHolder = 0;
        System.out.println("Randomly scrambling the array: ");
        for(int i = 0; i < studentGrades.length;)
        {
            newRan = (int) ((Math.random()) * studentGrades.length);
            placeHolder = studentGrades[i];
            studentGrades[i] = studentGrades[newRan];
            studentGrades[newRan] = placeHolder;
            i++;
        }
    }
    
    public static void linearSearch(int[] studentGrades, int searchInput)
    {
        boolean checker = true;
        int checkCount = 0;
        for(int i = 0; i < studentGrades.length; i++)
        {
            if(studentGrades[i] == searchInput)
            {
                i++;
                System.out.println(searchInput + " was found after " + i + " iterations.");
                checker = false;
            }
            checkCount = i;
        }
        if(checker)
        {
            checkCount++;
            System.out.println(searchInput + " was not found after " + checkCount + " iterations.");
        }
    }
    
    public static int[] createArray(int size, int min, int max)
    {
        int[] studentGrades = new int[size];
        int allFif = 0;
        int gradeInput = 0;
        System.out.println("Please enter " + size + " integers ranging from " + min + " to " + max + ", each must be greater than or equal to the one entered before it.");
        while(allFif < size)
        {
            Scanner gradeScan = new Scanner(System.in);
            if(gradeScan.hasNextInt())
            {
                gradeInput = gradeScan.nextInt();
                if(gradeInput >= min && gradeInput <= max)
                {
                    if(allFif != min)
                    {
                        if(gradeInput >= studentGrades[allFif-1])
                        {
                            studentGrades[allFif] = gradeInput;
                            allFif++;
                        }
                        else{
                            System.out.println("The entered value is not greater than or equal to the previous entered value.");
                        }
                    }
                    else{
                        studentGrades[allFif] = gradeInput;
                        allFif++;
                    }
                }
                else{
                    System.out.println("This number is not in the range of " + min + " to " + max + ".");
                }
            }
            else{
                System.out.println("This input is not a valid integer.");
            }
        }
        return studentGrades;
    }
}
