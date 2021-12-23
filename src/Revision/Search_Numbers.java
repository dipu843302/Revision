package Revision;

import java.util.Scanner;

public class Search_Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long arr[]=new long[(int) n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextLong();
        }
        int q=scanner.nextInt();
        while (q-->0){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int count=0;
            for (int i=0;i<n;i++){
                if (a<=arr[i] && b>=arr[i]){
                  count++;
                }
            }
            System.out.print(count+" ");

        }
    }
}
