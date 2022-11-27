package Exam;

import java.util.Scanner;

public class Q4_if_else_if {
    public static void main(String[] args) {

        while (true) {
            System.out.print("Enter a number..:  ");
            int userInputValue = new Scanner(System.in).nextInt();
            if (userInputValue % 4 == 0) {
                System.out.println("This is Leap year");
            } else {
                System.out.println("This is not leap year bro!!");
            }

        }
    }
}

