package Arrays;

public class EvenOrOddCount
{
    public static void EvenOrOdd(int[] arr){
        int even =0;
        int odd =0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }

       }
        System.out.println("Even :"+even +" "+"Odd :"+odd);
    }

    public static void main(String[] args) {
        int[] arr = {12,98,54,23,3};
        EvenOrOdd(arr);
    }
}
