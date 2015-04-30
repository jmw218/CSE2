//Joshua Whitton
//April 30th 2015
//CSE2
//
//Working with ragged arrays, array operations, and sorting.

public class RagArray
{
    public static void main(String[] args)
    {
        int[][] mainArray = new int[5][];
        
        for(int j = 0; j < mainArray.length; j++)
        {
            mainArray[j] = new int[(j * 3) + 5];
            for(int k = 0; k < mainArray[j].length; k++)
            {
                mainArray[j][k] = (int)(Math.random() * 39);  //goes through and sets all the sizes for the arrays, then gives them a random number from 0 to 39.
            }
        }
        System.out.println("The array before sorting: ");
        printArray(mainArray);
        System.out.println();  //prints the array
        
        sortArray(mainArray);
        System.out.println("The array after sorting: ");
        printArray(mainArray);
        System.out.println();  //we then sort it and print it again
        
        mainArray = convertArray(mainArray);
        System.out.println("The array after being sorted and converted: ");
        printArray(mainArray);  //we then convert it and print it again
        
    }

    public static void printArray(int[][] array)  //goes through every member of the array and prints it in a row organized manner.
    {
        for(int i = 0; i < array.length; i++)
        {
            //System.out.println();
            System.out.print("Row " + (i+1) + ": ");
            for(int k = 0; k < array[i].length; k++)
            {
                if(array[i][k] > 9)
                {
                    System.out.print(array[i][k] + " ");
                }
                else{
                    System.out.print(" " + array[i][k] + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void sortArray(int[][] list)  //sorts the individual members of the array to be in ascending order.
    {
        int holder = 0;
        for(int i = 0; i < list.length; i++)
        {
            for(int k = 0; k < list[i].length - 1; k++)
            {
                while(list[i][k+1] < list[i][k])
                {
                    holder = list[i][k+1];
                    list[i][k+1] = list[i][k];
                    list[i][k] = holder;
                    if(k > 0)
                    {
                        k--;
                    }
                }
            }
        }
    }
    
    public static int[][] convertArray(int[][] array)
    {
        int maxLength = array[array.length - 1].length;
        int[][] newArray = new int[array.length][maxLength];
        
        for(int j = 0; j < newArray.length; j++)  //creates a new array then sets it to the old arrays values then adds 0s after each of them have been added.
        {
            for(int k = 0; k < newArray[j].length; k++)
            {
                if(k < (j*3) + 5)
                {
                    newArray[j][k] = array[j][k];
                }
                else{
                    newArray[j][k] = 0;
                }
            }
        }
        
        return newArray;
    }
    
}