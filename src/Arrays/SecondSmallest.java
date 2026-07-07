package Arrays;

public class SecondSmallest
{
    public  static int SecondSmallestNumber(int[]arr)
    {
        if(arr.length <2){
            System.out.println("Array Should present at least 2 Elements");
            return -1;
        }

        int FirstSmallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;
        for(int i=0; i< arr.length;i++){
            if(arr[i] <FirstSmallest){
                SecondSmallest = FirstSmallest;
                FirstSmallest = arr[i];
            }else if(arr[i] < SecondSmallest && arr[i]!=FirstSmallest )
            {
                SecondSmallest = arr[i];
            }
        }
        if(SecondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second Smallest Not exists!!");
            return -1;
        }
        return SecondSmallest;
    }
    public static void main(String[] args)
    {
        int[] arr = {12,4,5,65,8,2,43,6};
        int secondSmallest = SecondSmallestNumber(arr);
        if(secondSmallest !=-1){
            System.out.println("Second Smallest :"+secondSmallest);
        }
    }
}
