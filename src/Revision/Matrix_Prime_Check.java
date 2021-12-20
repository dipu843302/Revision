package Revision;

import java.util.Scanner;

public class Matrix_Prime_Check {
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
        int count=0;
        int ans=0;
        for (int i=0;i<n;i++){

            for (int j=0;j<m;j++){
                int val=arr[i][j];
                count=0;
             for (int k=1;k<=val;k++){
                 if (val%k==0){
                     count++;
                 }
             }
             if (count==2){
                 ans++;
             }
            }
        }
        System.out.println(ans);
    }
}
