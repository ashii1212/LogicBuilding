package Arrays;

public class CountFrequency
{
    public static void Frequecy(int[] arr)
    {
        boolean[] isvisited = new boolean[arr.length];
        for(int i = 0; i< arr.length;i++){
            if(isvisited[i]){
                continue;
            }
            int count =1;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i] == arr[j]){
                    count++;
                    isvisited[j] = true;
                }
            }
            System.out.println(arr[i] +" =>"+count);
        }

    }

    public static void main(String[] args)
    {
       int[] arr = {1,23,34,65,3,2,4,5,3,};
        Frequecy( arr);
    }
}
