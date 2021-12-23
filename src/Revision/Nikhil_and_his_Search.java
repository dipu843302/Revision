package Revision;

import java.util.HashMap;
import java.util.Scanner;

public class Nikhil_and_his_Search {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long arr[]=new long[(int) n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextLong();
        }
        long q=scanner.nextLong();
        while (q-->0){
            long x=scanner.nextLong();
            long num=scanner.nextLong();

            if (x==0){
                int count=0;
                for (int i=0;i<n;i++){
                    if (num<=arr[i]){
                        count++;
                    }
                }
                System.out.println(count);
            }else if(x==1){
                int count=0;
                for (int i=0;i<n;i++){
                    if (num<arr[i]){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }

    }
}
