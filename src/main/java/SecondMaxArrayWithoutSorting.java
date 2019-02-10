
import java.util.*;
public class SecondMaxArrayWithoutSorting {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        System.out.print("Enter number in array");
        for (int i = 0; i < 10; i++) {
            Scanner scan1 = new Scanner(System.in);
            myArray[i] = scan1.nextInt();
        }

        int Max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;


        for (int i = 0; i < 10; i++)
        {
            if(myArray[i]>Max)
            {
                SecondMax=Max;
                Max=myArray[i];

            }
           else if(myArray[i]>SecondMax)
            {
                SecondMax=myArray[i];
            }
      }
      System.out.print("The max number is "+ Max);
      System.out.println("The second max number is"+SecondMax);
    }
}
