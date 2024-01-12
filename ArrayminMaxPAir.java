// Consider an integer array, the number of elements in which is determined by the user
// . The elements are also taken as input from the user. Write a program 
// to find those pair of elements that has the maximum and minimum difference among
//  all element pairs.
import java.util.*;
public class ArrayminMaxPAir {
    public static void main(String[] args)   
    {   int n;
        Scanner s = new Scanner(System.in);
        System.out.println("determine the size of array ");
        n = s.nextInt();
        int array [] = new int[n];

        // taking input from the user 

        for(int i = 0;i < n;i++)
        {
            System.out.println("enter the number  at "  + i + "th");
            array[i] = s.nextInt();
        }
        
        int lowest = array[0];
        int highest= array[0];
       

        for(int i = 0; i <n;i++)
        {
            if(array[i] < lowest)
            {
                lowest = array[i];
            }
            if(array[i] > highest)
            {
                highest = array[i];
            }
        }


        System.out.println("lowest value = " + lowest);
        System.out.println("higest value = " + highest);
        int max_diff= highest-lowest;
        System.out.println("maximum difference = " + max_diff);

        // programm to find second lowest number 

        s.close();


    }
}
