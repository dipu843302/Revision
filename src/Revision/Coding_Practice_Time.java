package Revision;

import java.util.Scanner;

public class Coding_Practice_Time {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int t=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int coun=0;
        for (int i=0;i<n;i++){
            if (arr[i]<t){
                coun++;
                t++;
            }
        }
        System.out.println(coun);

    }
}
