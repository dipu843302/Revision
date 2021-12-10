package sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<n-1;i++){
            int min_idx=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[i]){
                    min_idx=j;
                }
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
