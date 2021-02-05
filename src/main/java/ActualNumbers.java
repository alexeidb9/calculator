package main.java;
import java.io.*;
import java.lang.Math;
import java.util.*;

public class ActualNumbers {
    public static Scanner s = new Scanner(System.in);

    public static void dataInput() throws IOException {

        int firstNumber;
        int secondNumber;
        char operator;
        double answer = 0.0;

        System.out.println("What operation? (+, - , / , * , ^ , & (root)");
        operator = s.next().charAt(0);
        System.out.println("Enter the number");
        firstNumber = s.nextInt();
        System.out.println("Enter the second number");
        secondNumber = s.nextInt();


        switch (operator) {
            case '+':
                answer = firstNumber + secondNumber;
                break;
            case '-':
                answer = firstNumber - secondNumber;
                break;
            case '/':
                answer = firstNumber / secondNumber;
                break;
            case '*':
                answer = firstNumber * secondNumber;
                break;
            case '^':
                answer = (int) Math.pow(firstNumber, secondNumber);
                break;
            case '&':
                System.out.println(Math.sqrt(firstNumber));
                break;
        }
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " " + "=" + " " + answer);

        // Prints result into a file with calculations history
        File file = new File("src/log.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(answer);
        pw.close();
    }
}


