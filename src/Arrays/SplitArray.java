package Arrays;

import java.util.Arrays;

public class SplitArray
{
    public static  void SplitArray(int[] arr)
    {
        int half = arr.length/2;
        int[] temp1 = new int[half];
        int[] temp2 = new int[arr.length-half];
        for(int i=0; i<half;i++){
            temp1[i] = arr[i];
        }
        for(int i= half; i<arr.length;i++){
            temp2[i-half] = arr[i];
        }
        System.out.println(Arrays.toString(temp1));
        System.out.println(Arrays.toString(temp2));
    }

    public static void main(String[] args) {
        int[]arr = {1,3,4,2,3,4,5,7,8,10,4};
        SplitArray(arr);
    }
}
