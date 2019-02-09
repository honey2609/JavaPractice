import java.util.Scanner;

public class ArrayFind {
    public static void main(String[] args) {


        int MyArray[] = new int[10];
        System.out.println("Enter number in array");

        for (int i = 0; i < 10; i++) {
            Scanner scan1 = new Scanner(System.in);
            MyArray[i] = scan1.nextInt();

        }
        System.out.println("Enter number to find");
        Scanner scan2 = new Scanner(System.in);
        int number = scan2.nextInt();
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (number == MyArray[i]) {
                System.out.println("Number found at " + (i + 1) + " position");
                found = true;
            }

        }
        if (found == false)

            System.out.println("Number not found");

    }

}