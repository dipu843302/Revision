package Recursion_DSA;

import java.util.Scanner;

import static java.lang.Math.pow;

public class GP {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float n=scanner.nextInt();
        float r=scanner.nextInt();
        double res=print(r,n);

        System.out.printf("%.4f",res);
    }

    private static double print(float r, float n) {

        if (n==0)
            return 1;

        return 1/power(r,n)+print(r,n-1);
    }

    private static float power(float a, float b) {
        if (b==0)return 1;
        if (a==0)return 0;
        return a*power(a,b-1);


    }


}
