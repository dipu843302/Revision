package Recursion_DSA;

import java.util.Scanner;

public class Add_element {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int i=0;
            int N=arr.length;
            System.out.println(add(arr,N,i));
        }
    }

    private static int add(int[] arr,int N,int i) {
        if (i>N-2 )
        return 0;

        return (add(arr,N,i+1)+Math.abs(arr[i]-arr[i+1]));
    }
}
