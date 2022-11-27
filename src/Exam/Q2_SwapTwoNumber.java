package Exam;

import java.util.Scanner;

public class Q2_SwapTwoNumber {
    public static void main(String[] args) {
        int x, y, t;// x and y are to swap
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X..: ");
        x = sc.nextInt();
        System.out.print("Enter the value of Y..: ");
        y = sc.nextInt();


        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: "+x +"   " + y);
        System.out.println( );
    }
}
