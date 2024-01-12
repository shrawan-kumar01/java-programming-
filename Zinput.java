import java.util.*;
public class Zinput {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int array [] = new int[10];

       
       
         for(int i = 0;i<array.length;i++)
        {
            
                array[i] = s.nextInt();
           

        }
       
        for(int i = 0;i < array.length;i++)
        {
            System.out.println("array is " + array[i]);
        }
        s.close();


    }
}
