package week02;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        System.out.println("Square: " + getSquare(new Scanner(System.in).nextInt()));
    }

    private static int getSquare(int num) {
        return num * num;
    }
}
