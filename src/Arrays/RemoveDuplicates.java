package Arrays;

import javax.swing.*;
import java.util.Arrays;

public class RemoveDuplicates
{
    public static int[] duplicates(int[] arr)
    {
        int[] temp = new int[arr.length];
        int index= 0;
        for(int i=0; i< arr.length;i++)
        {
            boolean duplicate = false;
            for(int j=0; j<index ;j++){
                if(arr[i] == arr[j])
                {
                   duplicate = true;
                   break;
                }
            }
            if(!duplicate){
                temp[index++] = arr[i];
            }
        }
        return Arrays.copyOf(temp,index);
    }

    public static void main(String[] args) {
        int[] arr = {12,4,45,7,4,3,213,4,5,5,32,3};
        System.out.println(Arrays.toString( duplicates(arr)));
    }
}
