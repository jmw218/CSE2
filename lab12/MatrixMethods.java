//Joshua Whitton
//April 17th 2015
//CSE2
//
//The purpose of this lab is to create multiple methods that do various things involving multidimentional arrays

public class MatrixMethods
{
    public static void main(String[] args)
    {
        int widthOne = (int)(Math.random()*10) + 1;
        int heightOne = (int)(Math.random()*10) + 1;
        int widthTwo = (int)(Math.random()*10) + 1;
        int heightTwo = (int)(Math.random()*10) + 1;
        
        System.out.println("Matrix A (row format): ");
        int[][] exArray1 = increasingMatrix(widthOne, heightOne, true);
        printMatrix(exArray1, true);
        
        System.out.println();
        System.out.println("Matrix B (column format): ");
        int[][] exArray2 = increasingMatrix(widthOne, heightOne, false);
        printMatrix(exArray2, false);
        
        System.out.println();
        System.out.println("Matrix C (row format): ");
        int[][] exArray3 = increasingMatrix(widthTwo, heightTwo, true);
        printMatrix(exArray3, true);
        
        System.out.println();
        System.out.println("Adding A and B matrices: ");
        int[][] exArray4 = addMatrix(exArray1, true, exArray2, false);
        printMatrix(exArray4, true);
        
        System.out.println();
        System.out.println("Adding A and C matrices: ");
        int[][] exArray5 = addMatrix(exArray1, true, exArray3, true);
        printMatrix(exArray5, true);
    }
    
    public static int[][] increasingMatrix(int width, int height, boolean format)
    {
        int[][] incMat = new int[0][0];
        int counter = 1;
        if(width > 0 && height > 0)
        {
            if(format)
            {
                incMat = new int[height][width];
                for(int i = 0; i < height; i++)
                {
                    for(int k = 0; k < width; k++)
                    {
                        incMat[i][k] = counter;
                        counter++;
                    }
                }
            }
            else{
                incMat = new int[width][height];
                for(int i = 0; i < height; i++)
                {
                    for(int k = 0; k < width; k++)
                    {
                        incMat[k][i] = counter;
                        counter++;
                    }
                }
            }
        }
        else
        {
            System.out.println("The width and height are incompatible numbers for making an array.");
        }
        return incMat;
    }
    
    public static void printMatrix(int[][] array, boolean format)
    {
        if(array != null)
        {
            if(format)
            {
                for(int i = 0; i < array.length; i++)
                {
                    System.out.println();
                    System.out.print("{ ");
                    for(int k = 0; k < array[i].length; k++)
                    {
                        System.out.print( array[i][k] + ", ");
                    }
                    System.out.print("" + '\b' + '\b' + " }");
                }
                System.out.println();
            }
            else{
                for(int i = 0; i < array[0].length; i++)
                {
                    System.out.println();
                    System.out.print("{ ");
                    for(int k = 0; k < array.length; k++)
                    {
                        System.out.print( array[k][i] + ", ");
                    }
                    System.out.print("" + '\b' + '\b' + " }");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The array was null.");
        }
    }
    
    public static int[][] translate(int[][] array)
    {
        int[][] newArray = new int[array[0].length][array.length];
        
        for(int i = 0; i < newArray.length; i++)
        {
            for(int k = 0; k < newArray[i].length; k++)
            {
                newArray[i][k] = array[k][i];
            }
        }
        return newArray;
    }
    
    public static int[][] addMatrix(int[][] a, boolean formata, int[][] b, boolean formatb)
    {
        int[][] aArr = new int[0][0];
        int[][] bArr = new int[0][0];
        int[][] abArr = new int[0][0];
        if(formata)
        {
            aArr = new int[a.length][a[0].length];
            abArr = new int[a.length][a[0].length];
            aArr = a;
        }
        else{
            aArr = new int[a[0].length][a.length];
            aArr = translate(a);
            abArr = new int[a[0].length][a.length];
        }
        if(formatb)
        {
            bArr = new int[b.length][b[0].length];
            bArr = b;
        }
        else{
            bArr = new int[b[0].length][b.length];
            bArr = translate(b);
        }
        
        if(aArr.length == bArr.length && aArr[0].length == bArr[0].length)
        {
            for(int i = 0; i < aArr.length; i++)
            {
                for(int k = 0; k < aArr[i].length; k++)
                {
                    abArr[i][k] = aArr[i][k] + bArr[i][k];
                }
            }
        }
        else{
            System.out.println("Unfortunately the two arrays cannot be added.");
            abArr = null;
        }
        return abArr;
    }
}