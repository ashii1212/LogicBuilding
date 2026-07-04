package Arrays;

public class AverageElements
{
    public static double Average(int [] arr){
        int sum = 0;
        for(int i =0; i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
         return ((double)sum/ arr.length);

    }

    public static void main(String[] args) {
        int[] arr = {2,6,3,6,5,1};
        System.out.println("Average :"+Average(arr));
    }
}
