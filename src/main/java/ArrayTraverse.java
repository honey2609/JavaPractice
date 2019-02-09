import java.util.Scanner;

public class ArrayTraverse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = 10;
        int myArray[] = new int[10];
        System.out.println("Enter array of 10 elements:");
        for (int i = 0; i < 10; i++) {
            Scanner scan1 = new Scanner(System.in);
            myArray[i] = scan1.nextInt();
        }
        for (int i = 0; i < 10; i++) {

            if (i != N - 1) {
                System.out.print(myArray[i] + ",");
            } else {
                System.out.println(myArray[i]);
            }
        }

    }

}