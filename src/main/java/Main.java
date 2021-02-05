package main.java;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("What type of calculation it's going to be? \n (1. Actual Numbers, 2. Actual Numbers & Vector/Matrix " +
                "3. Vector 4. Matrix 5. Matrix & Vector)");
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
                main.java.VectorsOnly.vectorInput();
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


