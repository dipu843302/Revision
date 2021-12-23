package Revision;

import java.util.Scanner;

public class Spirally_Traversing_a_Matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int minR=0;
        int maxR=n-1;
        int minC=0;
        int maxC=n-1;
        int total=n*n;
        int count=0;

        while (count<total){
            for (int i=minC;i<=maxC;i++){
                if (count<total){
                    System.out.print(arr[minR][i]+" ");
                    count++;
                }
            }
            minR++;
            for (int i=minR;i<=maxR;i++){
                if (count<total){
                    System.out.print(arr[i][maxC]+" ");
                    count++;
                }
            }
            maxC--;
            for (int i=maxC;i>=minC;i--){
                if (count<total){
                    System.out.print(arr[maxR][i]+" ");
                    count++;
                }
            }
            maxR--;

            for (int i=maxR;i>=minR;i--){
                if (count<total){
                    System.out.print(arr[i][minC]+" ");
                    count++;
                }
            }
            minC++;
        }
    }
}
