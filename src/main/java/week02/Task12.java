package week02;

import java.util.Scanner;

public class Task12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int module = new Task12().getModule(sc.nextInt());
            System.out.println(module);
        }
        public static int getModule(int number) {
            if (number < 0) {
                number *= (-1);
            }
            return number;
        }
    }