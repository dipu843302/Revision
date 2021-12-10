package Revision;

import java.util.Scanner;

public class Power_of_Pirates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int q=scanner.nextInt();
        while (q-->0){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int count=0;

            if (a==0){
             for (int i=0;i<n;i++){
                 if (b<=arr[i])
                     count++;
             }
                System.out.println(count);
            }else {
                count=0;
                for (int i=0;i<n;i++){
                    if (b<arr[i])
                        count++;
                }
                System.out.println(count);
            }

        }
    }
}
