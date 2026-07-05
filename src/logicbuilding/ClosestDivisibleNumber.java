package logicbuilding;
import java.util.Scanner;

public class ClosestDivisibleNumber
{
    // Approach 1

    public static int ClosestNumber(int n, int m)
    {
        int closest = 0;
        int midiff = Integer.MAX_VALUE;
        for(int i=n-Math.abs(m);i<=n+Math.abs(m);i++)
        {
            if(i%m==0){
                int diff = Math.abs(n-i);
                if(diff < midiff || (diff == midiff && Math.abs(i)> Math.abs(closest)))
                {
                    closest =i;
                    midiff = diff;

                }
            }
        }
        return  closest;
    }

     // Approach 2


    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Enter a number :");
        int m = sc.nextInt();
        System.out.println("Closest Number is : "+ClosestNumber(n,m));

    }


}
