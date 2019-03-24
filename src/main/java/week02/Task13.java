package week02;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Task13.getSum(sc.nextInt(),sc.nextInt()));
    }
    public static int getSum(int a, int b) {
        return a+b;
    }
}
