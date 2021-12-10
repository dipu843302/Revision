package Recursion_DSA;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //System.out.println(print(n));
        //System.out.println(factorial(n));
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        AlphabetPrint(n,arr);
    }

   static void AlphabetPrint(int n, String[] arr) {
       if (n==0){
           return;
       }
       AlphabetPrint(n/10,arr);
       System.out.println(arr[n %10]);
    }


    private static int factorial(int n) {
        if (n==1)
        return n;
        return n*factorial(n-1);
    }

    public static int print(int n) {
        System.out.println(n);

        if (n==1)
        return n;
        return n+print(n-1);

    }
}
