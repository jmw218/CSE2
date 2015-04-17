//Joshua Whitton
//April 17th 2015
//CSE2
//
//The purpose of this lab is to create multiple methods that do various things involving multidimentional arrays

public class MatrixMethods
{
    public static void main(String[] args)
    {
        int[][] matr1 = increasingMatrix(3, 4, false);
        printMatrix(matr1, false);
        
        int[][] matr2 = translate(matr1);
        printMatrix(matr2, true);
    }
    public static int[][] increasingMatrix(int width, int height, boolean format)
    {
        int[][] incMat = new int[height][width];
        if(format)
        {
            for(int i = 0; i < incMat.length; i++)
            {
                for(int k = 0; k < incMat[i].length; k++)
                {
                    incMat[i][k] = (i*3) + k + 1;
                }
            }
        }
        else{
            for(int i = 0; i < incMat.length; i++)
            {
                for(int k = 0; k < incMat[i].length; k++)
                {
                    incMat[i][k] = i + (k*3) + 1;
                }
            }
        }
        return incMat;
    }
    public static void printMatrix(int[][] array, boolean format)
    {
        if(array != null)
        {
            System.out.println();
            for(int q = 0; q < array.length; q++)
            {
                System.out.println();
                System.out.print("[ ");
                for(int r = 0; r < array[q].length; r++)
                {
                    System.out.print(array[q][r] + " ");
                }
                System.out.print("]");
            }
        }
        else
        {
            System.out.println("The array was empty.");
        }
    }
    public static int[][] translate(int[][] array)
    {
        int[][] newArray = new int[array.length][array[0].length];
        //int[][] newArray = new int[array[0].length][array.length];
        for(int z = 0; z < array.length; z++)
        {
            for(int l = 0; l < array[z].length; l++)
            {
                array[l][z] = array[z][l];
            }
        }
        return newArray;
    }
}