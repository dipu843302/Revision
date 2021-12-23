package Revision;

import java.util.Scanner;

public class Product_Of_Array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                int ans=1;
                for (int j=0;j<n;j++){
                    if (i!=j){
                        ans*=arr[j];
                    }
                }
                System.out.print(ans+" ");
            }
            System.out.println();

        }
    }
}
