package Revision;

import java.util.Scanner;

public class Matrix_Traversal_Queries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int q=scanner.nextInt();
            int arr[][]=new int[n][m];
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    arr[i][j]=scanner.nextInt();
                }
            }
            if (q==1){
                for (int i=0;i<n;i++){
                    for (int j=0;j<m;j++){
                      if (i%2==0){
                          System.out.print(arr[i][j]+" ");
                      }else {
                          System.out.print(arr[i][m-1-j]+" ");

                      }
                    }
                }
            }else {
                for (int i=0;i<n;i++){
                    for (int j=0;j<m;j++){
                        if (i%2==0){
                            System.out.print(arr[i][m-1-j]+" ");
                        }else {

                            System.out.print(arr[i][j]+" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
