package Revision;

import java.util.Scanner;

public class Number_ofSegments_with_Good_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {

            int n = scanner.nextInt();
            int k=scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int count=0;

            for (int i=0;i<n;i++){
                int sum=0;
                for (int j = i; true; i++){
                     sum=sum+arr[j];
                    if (sum==k){
                        count=sum;
                        break;
                    }else if (sum<k){
                        count=Math.max(sum,count);
                    }
                }

            }
            System.out.println(count);
        }
    }
}
