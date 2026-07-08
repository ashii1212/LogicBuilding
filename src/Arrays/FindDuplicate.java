package Arrays;

public class FindDuplicate
{
    public static void Duplicates(int[]arr)
    {
        for(int i=0; i< arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,23,2,54,1,4,6,4};
        Duplicates(arr);
    }
}
