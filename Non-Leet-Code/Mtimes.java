//! Prints the number from 1 to N

import java.util.Scanner;

public class Mtimes {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s1.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

