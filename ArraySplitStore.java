// problem statment :
// Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
// INITIAL array :
// 58,	24	,13	,15,	63	,9	,8,	81,	1	,78

// After spliting :
// 58	24	13	15	63
// 9	8	81	1	78
public class ArraySplitStore {

    public static void main(String[] args)
    {
       
        int initialArray [] = {58,	24	,13	,15,	63	,9	,8,	81,	1	,78};
        int medIndex = initialArray.length/2;
        int fstArray [] = new int [medIndex];
        int secArray [] = new int [initialArray.length-medIndex];

        for(int i = 0; i < medIndex;i++)
        {
            fstArray[i] = initialArray[i];
        }
        for(int i = medIndex ; i<initialArray.length;i++)
        {
            secArray[i-medIndex] = initialArray[i];
        }
        System.out.println("first array");
        printArray(fstArray);

        System.out.println("Second half array");
        printArray(secArray);

    }

    public static void printArray(int array[])
    {
        for( int num : array)
        {
            System.out.print(num  + "\t");
        }
        System.out.println();
    }
    
}
