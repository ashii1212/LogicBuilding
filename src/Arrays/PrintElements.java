package Arrays;

public class PrintElements
{
    public static void print(int arr[])
    {
         for(int i=0;i<= arr.length-1;i++){
             System.out.println(arr[i]);
         }
    }

    public static void main(String[] args)
    {
        int arr[] = {1,7,56,54,9,87};
        print(arr);
    }
}
