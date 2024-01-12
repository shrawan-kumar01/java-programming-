public class LargestAnSmallest {
    
    public static void main(String[] args)
    {
        int array [] = {10,1,25,100,11,4,0,48,1000,55};
        int largest = array[0];
        int smallest = array[0];
        for(int i =0 ; i <array.length;i++)
        {
            if(array[i] > largest)
            {
                largest = array[i];
            }
            if(array[i] < smallest)
            {
                smallest = array[i];

            }
        }
        System.out.println("largest = " + largest);
        System.out.println("smallest = " + smallest);
    }
}