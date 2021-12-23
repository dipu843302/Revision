package Revision;

import java.util.Scanner;

public class Different_ways_as_a_Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        System.out.println(sum(n));
    }

    private static long sum(long n) {
        if (n==0)return 1;
        if (n<0)return 0;
        return sum(n-1)+sum(n-3)+sum(n-4);
    }
}
