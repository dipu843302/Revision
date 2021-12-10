package InterView_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Separation_ofOdd_Even {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {


            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();
           if (k==1) {
               for (int i = 0; i < n; i++) {
                   if (arr[i] % 2 == 0) {
                       System.out.print(arr[i]+" ");
                   }
               }
               for (int i = 0; i < n; i++) {
                   if (arr[i] % 2 == 1) {
                       System.out.print(arr[i]+" ");
                   }
               }
           }else {
               for (int i = 0; i < n; i++) {
                   if (arr[i] % 2 == 1) {
                       System.out.print(arr[i]+" ");
                   }
               }
               for (int i = 0; i < n; i++) {
                   if (arr[i] % 2 == 0) {
                       System.out.print(arr[i]+" ");
                   }
               }
           }


            System.out.println();
        }
    }
}
