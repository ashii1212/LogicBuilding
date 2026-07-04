package Arrays;

public class SumElements
{

    public static int sum(int[] arr)
    {
        int sum =0;
        for(int i=0; i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,2,2,4,7,5};
         int result = sum(arr);
        System.out.println("Result :"+result);

    }
}
