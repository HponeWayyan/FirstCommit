package Exam;

import java.util.Scanner;

public class Q14_Sum_of_All_Elements_of_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,sum=0;
        System.out.print("Enter the number of elements..: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements..: ") ;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of "+n+" elements in an array = "+sum);
    }
}
