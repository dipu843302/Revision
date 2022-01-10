package Revision;

import java.util.Scanner;

public class GP_Recursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int r=scanner.nextInt();
        System.out.printf("%.4f",GP(n,r));
    }
    private static double GP(int n, int r) {
        if (n==0)return 1;
        return  (1/Math.pow(n,r)+GP(n-1,r));
    }
}
