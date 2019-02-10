import java.util.Scanner;
public class ReverseInArray {
   public static void main (String[] args)
   {
    int myArray[] = new int[10];
      System.out.println("Enter elements in array");
      for(int i = 0;i<10;i++)

    {
        Scanner scan1 = new Scanner(System.in);
        myArray[i] = scan1.nextInt();
    }

       reverse(myArray);

    for(int i=0;i<10;i++)

    {
        System.out.print(myArray[i]+" " );
    }
}
  static void reverse(int myArray[])
     {
         int length=myArray.length-1;
       for(int i=0;i<myArray.length/2;i++)
       {
           int temp=myArray[i];
           myArray[i]=myArray[length-i];
           myArray[length-i]=temp;

       }
   }


}

