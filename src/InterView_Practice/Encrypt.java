package InterView_Practice;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Encrpyt {


    public static void main(test[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int low,high;
            Arrays.sort(a);
            low = 0;
            high = a.length - 1;
            while (low < high)
                if (a[low] + a[high] == k)
                    System.out.println("1");
                else if (a[low] + a[high] < k)
                    low++;
                else
                    high--;
            System.out.println("-1");
        }
    }
}