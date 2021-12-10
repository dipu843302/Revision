package Recursion_DSA;

import java.util.Scanner;

public class EtopowerX {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float x=scanner.nextInt();
        float n=scanner.nextInt();
        double res=print(x,n);
        System.out.printf("%.4f",res);
    }

    private static double print(float x, float n) {

        if (n==0)
            return 1;
        float a=power(x,n);
        double ans=a/fact(n)+print(x,n-1);
        return ans;
    }

    private static float fact(float n) {
      if (n==1)
          return 1;
       return n*fact(n-1);

    }

    private static float power(float x, float n) {
        int p=1;
       for (int i=0;i<n;i++){
           p*=x;
       }
       return p;
    }
}
