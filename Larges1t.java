public class Larges1t
{
    public int  largestElement(int array[])
    {
        int n = array.length;
        int largestEle = array[0];
        for(int i = 0;i < n; i++)
        {
            if(array[i] > largestEle)
                
            {
                largestEle = array[i];

            }
        }
        System.out.println(largestEle);
        return largestEle;

    }
    public static void main(String[] args)
    {
        Larges1t lr = new Larges1t();
        int array [] = {10,2,15,100,12,500};
        lr.largestElement(array);
    }
    
}
