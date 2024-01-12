
//         Take 20 integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0s.
import java.util.*;
public class TwentyInput {

    public static void  main(String[] args)
    {
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int zeros = 0;
        int even = 0;
        int n = 10;

        Scanner s = new Scanner(System.in);
        int array [] = new int [n];

        //  taking input and storing it in arrya 

        for(int i =0;i<array.length;i++)
        {
            array[i] = s.nextInt();
        }

        // number of positive number 
        for(int i = 0;i<array.length;i++)
        {
            if(array[i] > 0)
            {
                positive = positive + 1;
            }
        }
        System.out.println("the number of +ve = " + positive);
        negative = n-positive;
        System.out.println("the no of -ve is = " + negative );
        // chacking for even and odd  
        for(int i = 0;i<array.length;i++)
         {
            if(array[i] %2 == 0)
            {
                even = even+1;
            }
         }
         System.out.println("the number of even is = " + even);
         odd = n-even;
         System.out.println("the number of odd is = " +odd);

        //  checking for zeros 

        for(int i =0;i <array.length;i++)
        {
            if(array[i] == 0)
            {
                zeros = zeros + 1;
            }
        }
        System.out.println("zeros = "+ zeros);
        s.close();
    }
    
}
