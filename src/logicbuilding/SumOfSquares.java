package logicbuilding;

import javax.swing.*;
import java.util.Scanner;

public class SumOfSquares
{
    // Approach 1
     public static  int SumofSqares(int n)
     {
          int sum =0;
         for(int u =1; u<=n;u++)
         {
             sum = sum +(int) Math.pow(u,2);
         }
         return  sum;
     }
   // Approach 2
    public static  int SumOFSquares(int n)
    {
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum = sum+(i*i);
        }
        return sum;
    }
    // Approach 3
    public static int SUMOFSQUARES(int n)
    {
         return  n*(n+1)*(2*n+1)/6;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Approach 1");
        System.out.println(" Sum of Squares :"+SumofSqares(n));
        System.out.println("Approach 2");
        System.out.println(" Sum of Squares :"+SumOFSquares(n));
        System.out.println("Approach 3");
        System.out.println(" Sum of Squares :"+SUMOFSQUARES(n));
    }

}
