package Revision;

import java.util.Scanner;

public class Subarrays_Having_Sum_Less_Than_M {
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
            int count=0;
            for (int i=0;i<n;i++){
                int temp=0;
                for (int j=i;j<n;j++){
                    temp+=arr[j];
                    if (temp<k){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
