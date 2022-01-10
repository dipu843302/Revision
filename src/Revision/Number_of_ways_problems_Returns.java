package Revision;

import java.util.Scanner;

public class Number_of_ways_problems_Returns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        System.out.println(print(n));
    }

    public static int print(long n){
        if(n==0)return 1;
        if(n<0)return 0;

        return print(n-1)+print(n-2)+print(n-3);

    }
}
