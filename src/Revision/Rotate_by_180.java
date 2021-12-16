package Revision;

import java.util.Scanner;

public class Rotate_by_180 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[][]=new int[n][n];
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    arr[i][j]=scanner.nextInt();
                }
            }
            for (int i=n-1;i>=0;i--){
                for (int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
