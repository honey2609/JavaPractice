
import java.util.*;
public class ArrayMax {
                public static void main(String[] args)
                {
                    int MyArray[]=new int[10];
                    System.out.println("Enter number in array");
                    for(int i=0;i<10;i++)
                    {
                        Scanner scan1=new Scanner(System.in);
                     MyArray[i]=scan1.nextInt();
                    }
                   int max=Integer.MIN_VALUE;
                    for(int i=0;i<10;i++)
                    {
                        if(MyArray[i]>max)
                            max=MyArray[i];
                    }
                   System.out.println("The max number is " + max);
                }

}
