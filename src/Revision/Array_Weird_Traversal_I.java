package Revision;

import java.util.Scanner;

public class Array_Weird_Traversal_I {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int c1=0;
        int c2=0;
        int c3=0;
        for (int i=0;i<n/2;i++){
            c1+=arr[i][0];
        }

        for (int i=0;i<n;i++){
            c2+=arr[n/2][i];
        }
        for (int i=n/2+1;i<n;i++){
            c3+=arr[i][n-1];
        }
        System.out.println(c1*3+c2+c3*2);
    }
}
