package Revision;

import java.util.Scanner;

public class Rotate_Elements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr =new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        int minR=0;
        int minC=0;
        int maxR=n-1;
        int maxC=n-1;

        int total=n*n;
        int count=0;
        int temp=0;
        for (int k=0;k<n/2;k++){

            int prev=arr[minR+1][minC];

            for (int i=minC;i<=maxC;i++){
                if (count<=total){
                      temp=arr[minR][i];
                    arr[minR][i]=prev;
                    prev=temp;
                    count++;
                }
            }
            minR++;

            for (int i=minR;i<=maxR;i++){
                if (count<=total){
                    temp=arr[i][maxC];
                    arr[i][maxC]=prev;
                    prev=temp;
                    count++;
                }
            }
            maxC--;
            for (int i=maxC;i>=minC;i--){
                if (count<=total){
                    temp=arr[maxR][i];
                    arr[maxR][i]=prev;
                    prev=temp;
                    count++;
                }
            }
            maxR--;

            for (int i=maxR;i>=minR;i--){
                if (count<=total){
                    temp=arr[i][minC];
                    arr[i][minC]=prev;
                    prev=temp;
                    count++;
                }
            }
            minC++;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
