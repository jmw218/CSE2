//Joshua Whitton
//April 21st 2015
//CSE2
//
//Practicing matrix multiplication by multiplying randomized matricies.

import java.util.Scanner;

public class Multiply
{
    public static void main(String[] args)
    {
        boolean checkEqual = true;
        int[][] oneArray = new int[0][0];  //creates a 2D array for later use
        int[][] twoArray = new int[0][0];  //creates 2D array
        while(checkEqual)  //keeps going until check equal is changed to false
        {
            System.out.println("Please enter the dimensions of the first array: ");
            oneArray = makeArray();
            System.out.println("Please enter the dimensions of the second array: ");
            twoArray = makeArray();
            if(oneArray.length == twoArray[0].length && oneArray[0].length == twoArray.length)  //the arrays are made using the methods and then it checks if the dimensions are correct
            {
                checkEqual = false;  //ends loop if correct dimensions
            }
            else{
                System.out.println("Array one's width must be equal to two's height, and one's height equal to two's width.");
            }
        }
        
        printMatrix(oneArray);  //prints the first array
        
        System.out.println("--------------------------");
        printMatrix(twoArray);  //prints second array
        
        System.out.println("--------------------------");
        String[][] multiArray = maxtrixMultiply(oneArray, twoArray);
        printMatrix(multiArray);  //uses multiply method and then prints the result
        if(twoArray[0].length > twoArray.length)
        {
            System.out.println("Number of outputs = " + (twoArray.length * twoArray[0].length * oneArray[0].length));
        }
        else{
            System.out.println("Number of outputs = " + (oneArray.length * oneArray[0].length * twoArray[0].length));  //calculates the number of outputs made by the multiply method.
        }
    }
    public static int[][] randomMatrix(int width, int height)
    {
        int[][] ranArray = new int[height][width];  //creates array using provided dimensions.
        int rows = height;
        int cols = width;
        for(int i = 0; i < rows; i++)
        {
            for(int k = 0; k < cols; k++)
            {
                ranArray[i][k] = (int)(Math.random()*21) - 10;  //a random number from -10 to 10 is given to each spot in the array
            }
        }
        return ranArray;  //returns the array
    }
    public static void printMatrix(int[][] listList)
    {
        for(int i = 0; i < listList.length; i++)
        {
            System.out.println();
            System.out.print("{ ");
            for(int k = 0; k < listList[i].length; k++)
            {
                System.out.print( listList[i][k] + ", ");  //prints the pieces of the array
            }
            System.out.print("" + '\b' + '\b' + " }");  //'\b' is used to delete the last "," in the printed stuff
        }
        System.out.println();
    }
    public static void printMatrix(String[][] listList)  //this method is the same as the other printMatrix but instead uses a String[][] input
    {
        for(int i = 0; i < listList.length; i++)
        {
            System.out.println();
            System.out.print("{ ");
            for(int k = 0; k < listList[i].length; k++)
            {
                System.out.print( listList[i][k] + ", ");
            }
            System.out.print("" + '\b' + '\b' + " }");
        }
        System.out.println();
    }
    public static String[][] maxtrixMultiply(int[][] list1, int[][] list2)  //its a string so it can hold the linear data
    {
        String[][] multiMatrix = new String[0][0];  //initialized so that the program compiles
        if(list1.length >= list1[0].length)  //checks this because depending on it the matrixe's dimensions will be different
        {
            multiMatrix = new String[list1.length][list1[0].length];
        }
        else{
            multiMatrix = new String[list1.length][list1.length];
        }
        
        if(list1.length == list2[0].length && list1[0].length == list2.length)  //makes sure yet again that the dimensions are compatible
        {
            for(int row = 0; row < multiMatrix.length; row++)  //goes through each row
            {
                
                for(int col = 0; col < multiMatrix[row].length; col++)  //goes through each column
                {
                    
                    String eleMat = "{ ";
                    for(int add = 0; add < list2.length; add++)  //this is part of the multiplication of matrixes shown in the homework paper.  It moves the things it is multiplying since there is a 3rd dimension essentially.
                    {
                        eleMat += (list1[row][add] * list2[add][col]) + ", ";  //calculates the position*position then adds string comma
                    }
                    eleMat += "" + '\b' + '\b' + " }";
                    multiMatrix[row][col] = eleMat;  //sets the matrix spot to that string line
                }
            }
        }
        else{
            System.out.println("Error: The two arrays are of incompatible perimeters.");
        }
        return multiMatrix;  //returns the array
    }
    
    public static int[][] makeArray()
    {
        int width = 0;  //initializes
        int height = 0; //initializes
        
        System.out.println("Please enter a width for your array: ");
        width = getPerim();  //gets the width perimeter from user
        System.out.println("Please enter a height for your array: ");
        height = getPerim();  //gets height perimeter from user
        
        int[][] theArray = randomMatrix(width, height);  //uses the perimeters to get a random matrix
        return theArray;  //returns the matrix array
    }
    public static int getPerim()
    {
        boolean typeLoop = true;  //continues until the user successfully enters a compatible input
        int perimeter = 0;
        while(typeLoop)  // typeLoop boolean ^
        {
            Scanner userInput = new Scanner(System.in);
            if(userInput.hasNextInt())
            {
                int userEntry = userInput.nextInt();
                if(userEntry > 1)
                {
                    perimeter = userEntry;  //straight forward, makes sure it is an int greater than 1 then ends the loop and returns the input.
                    typeLoop = false;
                }
                else
                {
                    System.out.println("This input is not greater than 1.");
                }
            }
            else{
                System.out.println("This input is not an integer.");
            }
        }
        return perimeter;
    }
}