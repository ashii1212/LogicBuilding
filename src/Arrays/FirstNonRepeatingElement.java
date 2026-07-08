package Arrays;

public class FirstNonRepeatingElement
{
   static void nonrepeatinmgelmemt(int[] arr)
   {
      for(int i=0; i<arr.length;i++){
          boolean isreapting = false;
          for(int j=0; j< arr.length;j++)
          {

              if(i!=j && arr[i]==arr[j])
              {
                  isreapting = true;
                  break;
              }
          }
          if(!isreapting)
          {
              System.out.println("non reapting elemnt :"+arr[i]);
              return;
          }
      }
       System.out.println("NO non repeating element");
   }

    public static void main(String[] args) {
        int[] arr = {1,3,1,3,5};
             nonrepeatinmgelmemt(arr);
    }
}
