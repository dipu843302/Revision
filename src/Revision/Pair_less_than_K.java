package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_less_than_K {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();
            Arrays.sort(arr);

            int temp = 0;
            int i = 0;
            int j = n - 1;
            while (i < j) {
                int s = arr[i] + arr[j];
                if (s < k) {
                    temp = Math.max(temp, s);
                    break;
                } else {
                    j--;
                }

            }
            if (temp == 0) {
                System.out.println(-1);
            } else {
                System.out.println(temp);
            }
        }
    }
}
