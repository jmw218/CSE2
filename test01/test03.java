import java.util.Scanner;
import java.util.Random;

public class test03
{
    public static void main(String[] args)
    {
        int[][] ROFLFUCK = new int[3][4];
        int height = ROFLFUCK.length;
        for(int row = 0; row < height; row ++)
        {
            int width = ROFLFUCK[ row ].length;
            for(int col = 0; col < width; col ++)
            {
                ROFLFUCK[ row ][ col ] = col + (2 * row );
            }
        }
        System.out.println(height);
        printMatrix(ROFLFUCK);
    }
    public static void printMatrix(int[][] listList)
    {
        for(int row = 0; row < listList.length; row ++)
        {
            System.out.println();
            System.out.print("{ ");
            for(int col = 0; col < listList[ row ].length; col ++)
            {
                System.out.print( listList[ row ][ col ] + ", ");
            }
            System.out.print("" + '\b' + '\b' + " }");
        }
    }
}