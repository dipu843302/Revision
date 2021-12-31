package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Party_or_Not {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int c=scanner.nextInt();
        int r=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
       for (int i=0;i<c;i++){
               count+=arr[i];
       }
       if (count<=r){
           System.out.println("Party");
       }else {
           System.out.println("Sad");
       }
    }
}
