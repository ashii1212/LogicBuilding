package Arrays;

import javax.swing.*;
import java.util.Arrays;

public class MergeTwoArrays
{
    public static  void  Merge(int[]arr1, int[]arr2){
        int temp[] = new int[arr1.length+arr2.length];
        int count =0;
        for(int i=0; i<arr1.length;i++){
            temp[i] = arr1[i];
        }

        for(int j=0;j<arr2.length;j++){
            temp[arr1.length+j] = arr2[j];
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1,4,1,13,34,4};
        int[] arr2 = {1,3,4,3,1,3,45,6,87};
        Merge(arr1,arr2);
    }
}
