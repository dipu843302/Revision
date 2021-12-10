package Revision;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int k=scanner.nextInt();
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int l=0;
        int h=n-1;
        while (l<=h){
            int mid=(l+h)/2;

            if (arr[mid]==k){
                System.out.println(mid);
                break;
            }else if (arr[mid]<k){
                l=mid+1;
            }else {
                h=mid-1;
            }
        }
    }
}
