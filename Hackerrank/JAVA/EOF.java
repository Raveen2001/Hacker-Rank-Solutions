package Hackerrank.JAVA;

import java.io.*;
import java.util.*;

public class EOF {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        int count = 1;
        while (s.hasNext()) {
            System.out.println(count + " " + s.nextLine());
            count++;
        }
    }
}
