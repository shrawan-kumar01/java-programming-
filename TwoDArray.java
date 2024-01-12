// initilise and priint 2d array 
public class TwoDArray {
    
    public static void main(String [] args)
    {
        int row =3;
        int col = 4;
        int [] [] array = new int[row][col];

        printTwoDArray(array);
       
    }
    public static void printTwoDArray(int [][]array)
    {
        int value = 1;
        for(int i = 0;i<array.length;i++)
        {
            for(int j = 0;j < array[i].length;j++)
            {
                array[i][j] = value ++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}
