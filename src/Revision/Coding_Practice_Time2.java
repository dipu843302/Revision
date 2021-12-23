package Revision;

import java.util.Scanner;

public class Coding_Practice_Time2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
         int count=0;
        for (int i=0;i<n;i++){
            count+=arr[i];
        }
        System.out.println(count/m);
    }




}
