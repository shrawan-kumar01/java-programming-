// Take 10 integer inputs from user and store them in an array. 
// Again ask user to give a number. Now, tell user whether that number is present in array or not

import java.util.*;
public class Userguse {

    public static void main(String[] args) {
        int rand ;
        Scanner s = new Scanner(System.in);
        int array [] = new int [10];
        for(int i =0;i <array.length;i++)
        {
            array[i] = s.nextInt();
        }

        // asking the user to give a number 
        System.out.println("please enter a random number :~ ");
        rand = s.nextInt();

        boolean found = false;
        for(int i = 0;i < array.length;i++)
        {
            if(rand == array[i])
            {
                found = true;
                System.out.println(rand + "is exist in array at " + i);
                break;
            }
            
        }
        if(!found)
        {
             {
                System.out.println(rand + "is not found ");
            }
        }
           
           
        s.close();



    }
}

