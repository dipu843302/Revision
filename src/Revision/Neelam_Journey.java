package Revision;

import java.util.Scanner;

public class Neelam_Journey {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int temp=arr[0];
        int count=0;
        int ans=0;
        for (int i=0;i<n;i++){
            if (arr[i]<temp){
                ans+=temp*count;
                temp=arr[i];
                count=0;
            }
            count++;
        }
        ans+=temp*count;
        System.out.println(ans);
    }
}
