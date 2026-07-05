package Arrays;

public class SecondLargest
{
     public static int SecondMax(int[] arr)
     {
         if(arr.length <2){
             System.out.println("Array  should have at least 2 elements");
             return -1;
         }
         int FirstLargest = Integer.MIN_VALUE;
         int SecondLargest = Integer.MIN_VALUE;
         for(int i=0; i<arr.length;i++){
             if(arr[i] > FirstLargest){
                 SecondLargest = FirstLargest;
                 FirstLargest = arr[i];
             } else if (arr[i] > SecondLargest && arr[i] !=FirstLargest)
             {
                 SecondLargest = arr[i];
             }
         }
         if(SecondLargest == Integer.MIN_VALUE)
         {
             System.out.println("Second largest element does not exist.");
             return -1;
         }
         return SecondLargest;
     }

    public static void main(String[] args) {
        int[] arr = {1,23,43,45,7,9};
        int result = SecondMax(arr);
        if(result !=-1){
            System.out.println("SecondLargest  Element :"+result);
        }
    }
}
