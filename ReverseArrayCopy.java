// Take 10 integer inputs from user and store them in an array.
//  Now, copy all the elements in an another array but in reverse order.
import java.util.*;
public class ReverseArrayCopy {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int array [] = new int[10];
        for(int i = 0;i < array.length;i++)
        {
            array[i] = s.nextInt();
        }

        //  initilising the reverse array 
        int revArray [] = new int [10];
        // int j = 0;
        for(int  i = 0,j = array.length-1;i < array.length;i++,j--)
        {
            revArray[j] = array[i];
        }

        printArray(array);
        printArray(revArray);


        s.close();
    }

    static void printArray( int array[])
    {
        for(int i =0;i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
