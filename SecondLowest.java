// find the second lowest number in an array 
public class SecondLowest {
    
    public static void main(String[] args)
    {
        int[] numbers = {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};
        int SecondLowest = findSecondLowest(numbers);
        System.out.println("Second lowest number = " + SecondLowest);

    }
    public static int findSecondLowest(int array[])
    {
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        for( int num : array)
        {
            if(num < lowest)
            {
                secondLowest = lowest;
                lowest = num;

            }else if(num < secondLowest && num != lowest)
            {
                secondLowest = num;
            }
        }
        return secondLowest;
    }
}
