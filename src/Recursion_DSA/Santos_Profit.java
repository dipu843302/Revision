package Recursion_DSA;

import java.util.Scanner;

public class Santos_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a-->0){
            int b = scanner.nextInt();
            int count=0;
            System.out.println(profit(b,count));
        }

    }

    private static int profit(int b,int count) {
        if (b<0)return 0;
        if (b==0)return 1;

        return profit(b-4,count)+profit(b-8,count);

    }
}
