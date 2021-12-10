package Revision;

import java.util.Scanner;

public class Equilibrium_Element {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int l_Sum=0;
        int sum=0;
        int ans=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
       boolean bln=false;

        for (int i=0;i<n;i++){
            sum-=arr[i];
            if (sum==l_Sum){
                ans=i+1;
                bln=true;
                break;
            }
            l_Sum+=arr[i];

        }
        if (bln){
            System.out.println(ans);

        }else {
            System.out.println(-1);
        }
    }
}
