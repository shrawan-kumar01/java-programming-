// If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
//  your program should be able to find that the subarray lies between the indexes 3 and 8

public class SubArray {
    public static void main(String[] args )
    {
        int array []= {10,12,20,30,25,40,32,31,35,50,60};
        // given index =3,8
        int initial_index = 3;
        int final_index = 8;
        int subArray []= new int [final_index-initial_index+1] ; 

        for(int i = initial_index;i<final_index+1;i++)
        {
            subArray[i-initial_index] = array[i];
        }
        System.out.println("your sub array is : ~ ");
        printSubArray(subArray);
        

    }
    public static void printSubArray(int array [])
    {
        for(int i = 0 ; i <array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
