package Revision;

import java.util.Scanner;

public class Difference_of_K {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int arr[]=new int[n];

            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int l=0;
            int r=l+1;
            boolean bln=false;

            while (l<n && r<n-1){
                int comp=Math.abs(arr[l]-arr[r]);
                if (comp==k){
                    bln=true;
                    break;
                }else if (comp<k){
                    l++;
                }else {
                    r--;
                }
            }
            if (bln){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
