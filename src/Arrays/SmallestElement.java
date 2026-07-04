package Arrays;

public class SmallestElement {
    public static int Smallest(int[] arr)
    {
        int smallest = arr[0];
        for(int i=0; i< arr.length;i++){
            if(arr[i] <smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,65,3,123,56,67,0};
        System.out.println("Smallest Element  :"+Smallest(arr));
    }
}
