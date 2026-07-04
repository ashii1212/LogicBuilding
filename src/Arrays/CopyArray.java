package Arrays;


import java.util.Arrays;
// Approach 1
public class CopyArray
{
    public static int[] copy(int[] arr)
    {
        int[] newarr = new int[arr.length];
        for(int i=0; i< arr.length;i++){
            newarr[i] = arr[i];
        }

        return newarr;
    }
// Approach 2
    public static int[] Copy(int[] arr)
    {
        int[] newarr = Arrays.copyOf(arr,arr.length);
        return newarr;
    }
    // Approach 3
    public static int[] Copyarray(int[] arr)
    {
       int[]newarr = arr.clone();
       return newarr;
    }
    //Approach 4
    public static int[] copyarray(int[] arr){
        int [] newarr = new int[arr.length];
        System.arraycopy(arr,0,newarr,0,arr.length);
        return newarr;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,4,5,67,3,2};
        System.out.println(Arrays.toString(copy(arr)));
        System.out.println(Arrays.toString(Copy(arr)));
        System.out.println(Arrays.toString( Copyarray(arr)));
        System.out.println(Arrays.toString( copyarray(arr)));

    }
}
