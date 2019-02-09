import java.util.*;
public class SecondMaxArray {
    public static void main(String[] args) {


        int myArray[]=new int[10];
        for(int i=0;i<10;i++)
        {
            Scanner scan1=new Scanner(System.in);
            myArray[i]=scan1.nextInt();
        }
        Arrays.sort(myArray);
        System.out.println("Second largest number is"+myArray[8] );
        }
    }
