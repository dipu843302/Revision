package Revision;

import java.util.Scanner;

public class A_B_Possible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();

           if( possible(n,k)){
               System.out.println("Possible");
           }else {
               System.out.println("Not possible");
           }
        }
    }

    private static boolean possible(int n, int k) {

        if (n==k)return true;
        if (n>k)return false;

         n=n*2;
        if (n==k)return true;

         n=n*10+1;
        //if (n==k)return true;

         return possible(n,k);



    }
}
