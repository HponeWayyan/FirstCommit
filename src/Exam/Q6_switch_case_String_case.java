package Exam;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.util.Scanner;

public class Q6_switch_case_String_case {
    public static void main(String[] args) {
        System.out.print("Click any game from this Hockey,Cricket,Football..: ");
        Scanner obj = new Scanner(System.in);
        String game = obj.nextLine();

        switch(game){
            case "Hockey":
                System.out.println("Let's play Hockey");
                break;
            case "Cricket":
                System.out.println("Let's play Cricket");
                break;
            case "Football":
                System.out.println("Let's play Football");
        }
    }

    }

