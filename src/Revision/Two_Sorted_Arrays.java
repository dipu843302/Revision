package Revision;

import java.util.Scanner;

public class Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            long n=scanner.nextLong();
            long arr[]=new long[(int) n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
           int a= Math.max(8,5);
            int arr2[]=new int[(int) n];
            for (int i=0;i<n;i++){
                arr2[i]=scanner.nextInt();
            }
            int l=0;
            int r= (int) (n-1);
            int count=0;
            while (l<n && r>=0){
                if (arr[l]==arr2[r]){
                    count++;
                    l++;
                    r--;
                }else if (arr[l]<arr2[r]){
                    l++;
                }else {
                    r--;
                }
            }
            System.out.println(count);
        }
    }
}
