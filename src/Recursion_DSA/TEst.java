package Recursion_DSA;

import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(   fun(a,b));
    }

    private static int fun(int a, int b) {
        {
            if(b==0)
                return a;
            else
                return fun(b,a%b);
        }
    }
}
