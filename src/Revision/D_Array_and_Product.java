package Revision;

import java.util.Scanner;

public class D_Array_and_Product {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int q=scanner.nextInt();
        int arr[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int sum=1;
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
               sum*=arr[i][j];
                if (sum==q){
                    count++;
                }
            }

            sum=1;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                sum*=arr[j][i];
                if (sum==q){
                    count++;
                }
            }

            sum=1;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i==j)
                sum*=arr[i][j];
                if (sum==q){
                    count++;
                }
            }

            sum=1;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i+j==n-1)
                sum*=arr[i][j];
                if (sum==q){
                    count++;
                }
            }

            sum=1;
        }
        System.out.println(count);

    }
}
