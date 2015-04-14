public class test02
{
    public static void main(String[] args)
    {
        int[] lolist = new int[50];
        for(int i = 0; i < lolist.length; i++)
        {
            lolist[i] = 2*(i + 1);
        }
        
        int j = 0;
        for(int k = 0; k < 2 * lolist.length; k++)
        {
            j = k + 1;
            binarySearch(lolist, j);
        }
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
        }
    }
}