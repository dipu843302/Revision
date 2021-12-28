package Revision;

import java.util.Scanner;

public class Optimise_the_curve {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            long k=scanner.nextInt();
            long comp=1;
            boolean bln=false;
            int ans=0;
            for (int i=1;i<=k;i++){
                comp=a*i*i+b*i+c;
                if (comp>k){
                    bln=true;
                    ans=i;
                    break;
                }
            }
            if (bln){
                System.out.println(ans);
            }else {
                System.out.println(-1);
            }
        }
    }
}
