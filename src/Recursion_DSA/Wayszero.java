package Recursion_DSA;

import java.util.Scanner;

public class Wayszero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
       while (t-->0) {
            int n = scanner.nextInt();
            int ans = number(n);
            System.out.println(ans);
       }
    }

    private static int number(int n) {
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }

        return number(n-1)+number(n-2)+number(n-5);

    }
}
