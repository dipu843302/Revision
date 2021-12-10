package Revision;

import java.util.Scanner;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fibbo(n));
    }

    private static int fibbo(int n) {
        if (n<=1)return n;
        return fibbo(n-1)+fibbo(n-2);

    }
}
