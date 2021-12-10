package Recursion_DSA;

import java.util.Scanner;

public class birthday_shopping {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        for (int i=1;i<=n-1;i++){
            for (int j=i+1;j<=k+i+1;j++){
                System.out.println(i+" "+j);
            }
        }

    }
}
