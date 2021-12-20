package Revision;

import java.util.Scanner;

public class Nick_and_Hacks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            long n=scanner.nextLong();
            int one=1;
            if(tom(n,one)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private static boolean tom(long n,int one) {
        if(n==one)return true;
        if (n<one)return false;

            return tom(n,one*10) || tom(n,one*20);
    }
}
