package Arrays;

import java.util.Arrays;

public class ReverseArray
{
     //Approach 1
     public static void Reverse(int[] arr)
     {
         int[] newarr = new int[arr.length];
         int index= 0;
         for(int i = arr.length-1; i>=0;i--)
         {
             newarr[index] = arr[i];
             index++;
         }
         System.out.println(Arrays.toString(newarr));
     }
    // Approach 2
    public static void reverse(int[] arr){
        int[] newarr = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            newarr[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(newarr));
    }
    // Approach 3 without using another array
   public static void reverseArray(int[] arr)
   {
         int left = 0;
         int right = arr.length-1;
         while(left < right){
             int temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
             left++;
             right--;
         }
       System.out.println(Arrays.toString(arr));
   }

    public static void main(String[] args) {
        int[] arr = {1,4,2,6,8,0,9};
        Reverse(arr);
        reverse(arr);
        reverseArray(arr);
    }
}
