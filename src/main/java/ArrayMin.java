
import java.util.*;
public class ArrayMin {
    public static void main(String[] args)
    {
        int MyArray[]=new int[10];
        System.out.println("Enter number in array");
        for(int i=0;i<10;i++)
        {
            Scanner scan1=new Scanner(System.in);
            MyArray[i]=scan1.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<10;i++)
        {
            if(MyArray[i]<min)
                min=MyArray[i];
        }
        System.out.println("The min number is " + min);
    }

}
