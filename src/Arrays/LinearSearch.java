package Arrays;

public class LinearSearch
{
    public static int Element(int[] arr, int find)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==find){
                return i;

            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,34,3,5,6,87,9,6};
        int find = 9;
        int result = Element(arr,find);

        if(result !=-1){
            System.out.println("Element Found at index :"+result);
        }else{
            System.out.println("Element not Found");
        }
    }
}
