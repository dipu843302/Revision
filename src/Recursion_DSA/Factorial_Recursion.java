package Recursion_DSA;

import java.util.Scanner;

public class Factorial_Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (n == 1) return n;
        return fact(n - 1) * n;

    }
}
