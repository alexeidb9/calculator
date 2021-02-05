package main.java;
import org.jscience.mathematics.vector.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class VectorsOnly {
    public static Scanner s = new Scanner(System.in);

    public static void vectorInput() throws IOException {
        Vector vec1 = new Vector();

        System.out.println("Enter the value you want to add ('0' to show vector)");
        while(s.nextInt() != 0) {
            vec1.addElement(s.nextInt());
        } if (s.nextInt() == 0){
                System.out.println(vec1);

                // Prints result into a file with calculations history
            File file = new File("src/log.txt");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(vec1);
            pw.close();
            }



        }


    }

