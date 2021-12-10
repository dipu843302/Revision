package Revision;

import java.util.Scanner;

public class Santos_Profit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            System.out.println(profit(n));
        }
    }

    private static int profit(int n) {
     if (n<0)return 0;
     if (n<1)return 1;

        return profit(n-4)+profit(n-8);
    }
}
