package Revision;

import java.util.Scanner;

public class Minimum_in_sorted_rotated_array {
    public static void main(String[] args) {
        Scanner scanne=new Scanner(System.in);
        int n=scanne.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanne.nextInt();
        }


        Minimum(arr,0,n-1,-111111111);
    }

    private static int Minimum(int arr[],int l, int r, int min) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > min)
                return Minimum(arr, l, mid - 1, min);

            // Else the element can only be present
            // in right subarray
            return Minimum(arr, mid + 1, r, min);
        }

return min;
    }
}
