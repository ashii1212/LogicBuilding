package Arrays;

public class ArraySorted
{
    public static  void isSorted(int[]arr){
        boolean isSorted = true;
        for(int i=0; i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted!");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,1,5,2,4};
        isSorted(arr);
    }
}
