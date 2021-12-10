package Recursion_DSA;

import java.util.Scanner;

public class Power_Function {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println(power(a,b));
    }

    private static int power(int a, int b) {
        if (b==0)return 1;
      if (a==0)return 0;
       return a*power(a,b-1);


    }
}
