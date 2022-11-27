package Exam;

import java.util.Scanner;

public class Q9_Searching_an_array_for_a_particular_number_and_its_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 8;
        array[2] = 4;
        array[3] = 7;
        array[4] = 20;
        System.out.print("Search for?..: ");
        int searchFor = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchFor) {
                System.out.println(searchFor + " is at index " + i);
                break;
            }else{
                    System.out.println("Was not found ");

                }


        }

    }
}

