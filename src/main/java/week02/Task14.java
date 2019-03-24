package week02;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        double average = new Task14().getArithmetic();
        System.out.println("Srednee: " + average);
    }

    public double getArithmetic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int[] numbers = new int[sc.nextInt()];
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
