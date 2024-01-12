public class Largest
{
    public int largestNum(int arr[])
    {
        int n=arr.length ;
       
        int larg_ele = arr[0];
        for(int i = 0; i<n;i++)
        {
            if(arr[i] > larg_ele)
            {
                larg_ele = arr[i];
            }
        }
        System.out.println(larg_ele);
        return larg_ele;
    }

    public static void main(String[] args)
    {
        Largest lr = new Largest();
        int array [] ={10,20,30,2,1,45,100,0};
        lr.largestNum(array);
        


    }
}