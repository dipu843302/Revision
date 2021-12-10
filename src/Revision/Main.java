package Revision;

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int i=0;
            int ans=0;
              System.out.println(diff(arr,n,i,ans));


        }
    }
    public static int  diff(int arr[], int n, int i, int ans){
        if(i==n-1){
            return n;
        }
        ans+=Math.abs(arr[i]-arr[i+1])+ diff(arr,n-1,i+1,ans);
       // i++;

      //  System.out.println( ans);
return ans;
    }
}