package Revision;

import java.util.Scanner;

public class Rotate_element {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int minR=0;
        int maxR=n-1;
        int minC=0;
        int maxC=n-1;
        int size=n*n;
        int st=0;
        int temp=0;

        for(int k=0;k<n/2;k++){

            int prev=arr[minR+1][minC];
            
            for(int i=minC;i<=maxC;i++){
                if(st<=size){
                    temp=arr[minR][i];
                    arr[minR][i]=prev;

                    prev=temp;
                }
                st++;
            }

            minR++;
            for(int i=minR;i<=maxR;i++){
                if(st<=size){
                    temp=arr[i][maxC];
                    arr[i][maxC]=prev;
                    prev=temp;
                }
                st++;
            }

            maxC--;
            for(int i=maxC;i>=minC;i--){
                if(st<=size){
                    temp=arr[maxR][i];
                    arr[maxR][i]=prev;
                    prev=temp;
                }
                st++;
            }

            maxR--;
            for(int i=maxR;i>=minR;i--){
                if(st<=size){
                    temp=arr[i][minC];
                    arr[i][minC]=prev;
                    prev=temp;
                }
                st++;
            }

            minC++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
