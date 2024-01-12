// Write a program to find the sum and product of all elements of an array.
import java.util.*;
public class SunAndPdtArray {
    public static void main(String[] args)
    {
        int pdt = 1;
        int sum = 0;

        int array []  = new int [10];
        Scanner s = new Scanner(System.in);

        for(int i=0;i < array.length;i++)
        {
            array[i] = s.nextInt();
        }

        // finding product and sum 

        for(int i = 0 ; i < array.length;i++)
        {
            pdt = pdt * array[i];
            sum = sum + array[i];
        }
        s.close();
        System.out.println("Sum is = "+ sum );
        System.out.println("product  is = "+ pdt );


    }
}
