package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Ash_and_his_Redemption {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            int arr2[]=new int[n];

            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                arr2[i]=scanner.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(arr2);
            boolean bln=true;
            for (int i=0;i<n;i++){
                if (arr[i]>arr2[i]){
                }else {
                    bln=false;
                    break;
                }
            }
             if (bln){
                 System.out.println("Ash Finally Wins");
             }else {
                 System.out.println("Train Hard Again");
             }
        }
    }
}
