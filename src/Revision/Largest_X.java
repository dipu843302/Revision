package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_X {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            Arrays.sort(arr);
           int left=0;
            int right=n-1;
            boolean bln=false;
            int compare=0;
            while (left<right){
                if (arr[left]*-1==arr[right]){
                    if (compare<Math.abs(arr[right])) {
                        compare =Math.abs(arr[right]);
                        bln = true;
                    }
                    left++;
                    right--;
                }else if (arr[left]*-1<arr[right]){
                    right--;
                }else {
                    left++;
                }

            }
            if (bln){
                System.out.println(compare);
            }else {
                System.out.println(-1);
            }
        }
    }
}
