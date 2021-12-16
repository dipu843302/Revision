package Revision;

import java.util.Scanner;

public class All_Twice_Except_One {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int ans=0;
            for (int i=0;i<n;i++){
                ans=ans^arr[i];
            }
            System.out.println(ans);
        }
    }
}
