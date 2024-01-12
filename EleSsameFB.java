// Write a program to check if elements of an array are same or not it read from front or back. E.g.-
public class EleSsameFB {
    public static void main(String[] args)
    {
        int array[] = {1,2,3,4,0,0,11,3,2,1};
        boolean match = true;
        int j  = array.length-1;
        for(int i=0; i<array.length/2;i++ )
        {
            if(array[i] != array[j])
            {
                match = false;
                break;

            }else{
                j--;
            }
        }
        System.out.println(match);

        
    }
}
