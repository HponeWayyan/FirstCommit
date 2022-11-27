package Exam;

import java.util.Scanner;

public class Q11_Delete_Array_Element_by_value {
    public static void main(String[] args) {

            int count, i, index;
            int input[] = new int[100];

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Number of Elements in Array..: ");
            count = scanner.nextInt();

            System.out.print("Enter " + count + " Numbers..: ");
            for (i = 0; i < count; i++) {
                input[i] = scanner.nextInt();
            }

            System.out.print("Enter Index of Element to be Deleted..: ");
            index = scanner.nextInt();


            for (i = index; i < count - 1; i++) {
                input[i] = input[i + 1];
            }


            count--;

            System.out.println("Final Array");
            for (i = 0; i < count; i++) {
                System.out.print(input[i] + " ");
            }
    }
}
