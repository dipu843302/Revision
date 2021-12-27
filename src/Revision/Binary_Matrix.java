package Revision;

import java.util.Scanner;

public class Binary_Matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
               if (arr[i][j]==0){
                   System.out.print(1+" ");
               }else {
                   System.out.print(0+" ");
               }
            }
            System.out.println();
        }
    }
}
