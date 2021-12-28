package Revision;

import java.util.Scanner;

public class The_Peak_Point {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int index=0;
            int comp=-1;
            for (int i=0;i<n;i++){
                if(comp<arr[i]){
                    index=i;
                    comp=arr[i];
                }
            }
            System.out.println(index);
        }
    }
}
