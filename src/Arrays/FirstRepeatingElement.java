package Arrays;

public class FirstRepeatingElement
{
    public static void FirstRepeatingElement(int [] arr)
    {
        for (int i = 0; i < arr.length ; i++)
        {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {11,3,43,1,342,1,54,65,2};
        FirstRepeatingElement( arr);
    }


}
