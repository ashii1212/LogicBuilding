package logicbuilding;

import java.util.Scanner;

public class SumOfnNaturalNumbers
{
    // Approach1
    public static int sum(int n)
    {
        int sum =0;
        for(int i =1;i<=n;i++){
             sum = sum+i;
        }
        return sum;
    }

    // Approach 2

    public static int Sum(int n)
    {
        if(n==1){
            return 1;
        }
        return n+Sum(n-1);
    }


    //Approach 3
    public static  int SUM(int n)
    {
        return  n*(n+1)/2;
    }



    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println("/Approach 1");
        System.out.println("Sum of N natural number :"+sum(n));
        System.out.println("/Approach 2");
        System.out.println("Sum of N natural number :"+Sum(n));
        System.out.println("/Approach 3");
        System.out.println("Sum of N natural number :"+SUM(n));
    }

}
