package Revision;

import java.util.Scanner;

public class Kazama_Shinchan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        int index=0;
        boolean bln=false;
        for (int i=0;i<n;i++){
            if (arr[i]==k){
                bln=true;
                index=i;
                break;
            }
        }
        if (bln){
            System.out.println(index);
        }else {
            for (int i=0;i<n;i++){
                if (arr[i]+1==k){
                    System.out.println(i+1);
                }
            }
        }
    }
}
