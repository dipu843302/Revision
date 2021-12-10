package Recursion_DSA;

import java.math.BigInteger;
import java.util.Scanner;

public class Nick_Hack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){

            double n=scanner.nextDouble();

            double a=1;

            if (res(n,a)==true){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private static boolean res(double  n,double a) {

     if (n==a)
         return true;

     if (a>n)
       return false;

     if ((res(n,10*a) == true || res(n,20*a)==true))
         return true;

          return false;
    }
}
