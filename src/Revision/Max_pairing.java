package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Max_pairing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int arr2[]=new int[m];
        for (int i=0;i<m;i++){
            arr2[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int count=0;
        int l=0;
        int r=0;
        while (l<n && r<m){
            int diff=Math.abs(arr[l]-arr2[r]);
            if (diff<2){
                count++;
                l++;
                r++;
            }else if (arr[l]<arr2[r]){
                l++;
            }else {
                r++;
            }
        }
        System.out.println(count);
    }
}
