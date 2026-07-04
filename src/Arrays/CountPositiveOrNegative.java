package Arrays;

public class CountPositiveOrNegative
{
     public static void Count(int[] arr)
     {
         int positive = 0, negative =0, zero = 0;


         for(int i=0; i< arr.length;i++)
         {
             if(arr[i] >0){
                 positive++;
             }else if(arr[i]<0){
                 negative++;
             }else{
                 zero++;
             }
         }
         System.out.println("Positive :"+positive);
         System.out.println("Negative :"+negative);
         System.out.println("Zeros :"+zero);
     }

    public static void main(String[] args) {
      int [] arr = {1,4,67,-9,-2,0,8,-4};
      Count(arr);
    }
}
