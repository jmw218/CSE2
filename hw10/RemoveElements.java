//Joshua Whitton
//April 6 2015
//CSE2
//
//purpose is to use the provided code and create the methods that it runs
//methods will generate an array of 10 random integers
//remove one position from an array, making a new one which doesn't have that position and value
//remove all positions which contain a specific target value by replacing the array with one that has those places deleted.

import java.util.Scanner;

public class RemoveElements
{
  public static void main(String [] arg)
  {
    Scanner scan=new Scanner(System.in);
    int[] num = new int[10];
    int[] newArray1;
    int[] newArray2;
    int index,target;

    String answer="";

    do{
      System.out.print("Random input 10 ints [0-9]");
      num = randomInput();
      String out = "The original array is:";
      out += listArray(num);
      System.out.println(out);

      System.out.print("Enter the index ");
      index = scan.nextInt();
      newArray1 = delete(num,index);
      String out1="The output array is ";
      out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      System.out.println(out1);

      System.out.print("Enter the target value ");
      target = scan.nextInt();
      newArray2 = remove(num,target);
      String out2="The output array is ";
      out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      System.out.println(out2);

      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[])
  {
    String out="{";

    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static int[] randomInput() //first of the methods.  Takes no input and returns an integer array
  {
      int[] randomArray = new int[10];  //new array with 10 spots
      for(int i = 0; i < randomArray.length; i++)  //goes through all 10 spots
      {
          randomArray[i] = (int) ((randomArray.length)*(Math.random()));  //applies a random value from 0 to 9 to each spot in the array
      }
      return randomArray;  //returns the array
  }
  
  public static int[] delete(int[] list, int pos)  //takes an array and an integer position
  {
      int changer = 1;  //this is done so that we know if a value is being removed
      if(pos < 0 || pos > list.length - 1)  //if the index is invalid, no value will be removed.
      {
          changer = 0;  //makes it so array will be same length
          System.out.println("This index value is invalid.");
      }
      int[] specialArray = new int[list.length - changer];  //the array is created with a length minus the changer value from above.
      int k = 0; //used to determine the value to copy from the input array
      for(int i = 0; i < specialArray.length; i++)  //goes through the entirety of the array
      {
          if(i == pos)  //if i is equal to the position to be deleted
          {
              k++;  //then variable k skips that number
          }
          specialArray[i] = list[k];  //the new array then is set to the input array at the k value.
          k++;  //k goes up alongside i.
      }
      return specialArray;  //returns the array
  }
  
  public static int[] remove(int[] list, int target)  //takes an array and an integer for the target values to remove
  {
      int targAmount = 0;  //used to find how many of the target values there are
      for(int i = 0; i < list.length; i++)  //goes through the entire input array
      {
          if(list[i] == target)
          {
              targAmount++;  //adds up target values
          }
      }
      int[] targetArray = new int[list.length - targAmount];  //lowers the size of the new array based on target values found
      int q = 0;  //a value for copying over from the input array to the new array
      for(int k = 0; k < targetArray.length; k++)  //goes through the entire new array
      {
          while(list[q] == target)  //if the value is equal to the target,
          {
              q++;  //it skips over it by adding onto q
          }
          targetArray[k] = list[q];  //the new array is set equal to the q value of input array
          q++;  //q goes up alongside k
      }
      if(targAmount == 0)  //tells the user if there target value came up with no hits on the array.
      {
          System.out.println("The element wasn't found in the list.");
      }
      return targetArray;  //returns the array
  }
}
