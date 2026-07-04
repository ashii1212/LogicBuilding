package Arrays;

public class LargestElement {
    public static int Largest(int[] arr){
        int Largest = arr[0];
        for(int i=0; i< arr.length;i++)
        {
            if(arr[i] >Largest){
                Largest = arr[i];
            }
        }
        return Largest;
    }

    public static void main(String[] args) {
        int[] arr = {1,54,2,5,67,7};
        System.out.println("Largest :"+Largest(arr));
    }
}
