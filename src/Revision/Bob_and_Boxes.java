package Revision;

import java.util.Scanner;

public class Bob_and_Boxes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ans=sum(n);
        System.out.println(ans);
    }

    private static int sum(int n) {

        if (n<0)return 0;
        if (n==0)return 1;
        return sum(n-1)+sum(n-3)+sum(n-5);
    }
}
