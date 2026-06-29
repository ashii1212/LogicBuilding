package logicbuilding;

import java.util.Scanner;


public class SwapTwoNumbers
{
    // Approach 1
    public static void swap(int a ,int b)
    {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap value of A:"+a);
        System.out.println("After Swap value of B:"+b);
    }

    //Approach 2 using temp
    public static void Swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swap value of A:"+a);
        System.out.println("After Swap value of B:"+b);
    }
    // Approach 3
    public static void SwapUsingThirdVariable(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap value of A:"+a);
        System.out.println("After Swap value of B:"+b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int n = sc.nextInt();
        System.out.println("Enter number 2");
        int m = sc.nextInt();
        swap(n,m);
        Swap(n,m);
        SwapUsingThirdVariable(n,m);
    }

}
