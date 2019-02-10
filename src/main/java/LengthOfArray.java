
import java.util.*;
public class LengthOfArray {
 public static void main(String args[]) {
     int myArray[] = new int[10];
     System.out.print("Enter elements in array");
     for (int i = 0; i < 10; i++) {
         Scanner scan1 = new Scanner(System.in);
         myArray[i] = scan1.nextInt();
     }
     length(myArray);
     System.out.println(length(myArray));
   }

 public static int length(int myArray[])
     {   int length1=0;
         for(int i=0;i<myArray.length;i++)
         {
             length1=length1+1;
         }
         return length1;
     }


 }


