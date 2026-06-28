package logicbuilding;

import java.util.Scanner;

public class EvenOrOdd
{
   public  static boolean even(int n )
   {
       if((n&1)==0){
           return  true;
       }else{
           return  false;
       }
   }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Even :"+even(n));
    }

}
