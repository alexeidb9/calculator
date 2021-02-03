package main.java;

import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What type of calculation it's going to be? \n (1. Actual Numbers, 2. Vector, 3. Matrix)");
        int option = s.nextInt();
        s.nextLine();

        switch (option) {
            case 1:
                main.java.ActualNumbers.dataInput();
                break;
            case 2:
                //Combination of actual number and vector/or matrix.
                break;
            case 3:
                //Vectors
                break;
            case 4:
                //Matrixes
                break;
            case 5:
                //Combination of matrix and vector.
                break;
        }


    }
}


