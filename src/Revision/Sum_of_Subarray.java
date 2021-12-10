package Revision;

import java.util.Scanner;

public class Sum_of_Subarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int  n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();

        }
        int query=scanner.nextInt();
        while (query-->0){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            int count=0;
            for (int i=l-1;i<r;i++){
                count+=arr[i];
            }
            System.out.println(count);
        }
    }
}
