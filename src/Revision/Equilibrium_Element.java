package Revision;

import java.util.Scanner;

public class Equilibrium_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int l = 0;
        int r = n - 1;
        int m = (l + r) / 2;

        int left = 0;
        int right = 0;
        while (l <= m && m <= r) {

            while (l < m && m < r) {
                left += arr[l];
                right += arr[r];
                left++;
                right--;
            }
            if (left == right) {
                System.out.println(m);
                break;
            } else if (left < right) {
                m++;
            } else {
                m--;
            }
        }
    }


}
