package Revision;

import java.util.Scanner;

public class Spiral_Traversal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int arr[][]=new int[n][m];
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    arr[i][j]=scanner.nextInt();
                }
            }
            int minR=0;
            int maxR=n-1;
            int minC=0;
            int maxC=m-1;

            int total=m*n;
            int size=0;
            while (size<total){
                for (int i=minR;i<=maxR;i++) {
                    if (size < total) {
                        System.out.print(arr[i][minC] + " ");
                        size++;
                    }
                }
                minC++;

                for (int i=minC;i<=maxC;i++) {
                    if (size < total) {
                        System.out.print(arr[maxR][i] + " ");
                        size++;
                    }
                }
                maxR--;

                for (int i=maxR;i>=minR;i--) {
                    if (size < total) {
                        System.out.print(arr[i][maxC] + " ");
                        size++;
                    }
                }
                maxC--;

                for (int i=maxC;i>=minC;i--) {
                    if (size < total) {
                        System.out.print(arr[minR][i] + " ");
                        size++;
                    }
                }
                minR++;
            }
        }
        System.out.println();
    }
}
