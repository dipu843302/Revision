package Recursion_DSA;

import java.util.Scanner;

public class ArrayEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int even=0;
        int odd=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                even+=arr[i];
            }else {
                odd+=arr[i];
            }
        }
        System.out.println(even*2+odd*3);
    }
}
