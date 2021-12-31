package Revision;

import java.util.Scanner;

public class Subarray_and_Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
            int count=0;
            int subarray=0;
            int len=0;
            int check=0;
        for (int i=0;i<n;i++){
            subarray=0;
            len=0;

            for (int j=i;j<n;j++) {
                subarray += arr[i];
                len++;
                if (subarray%k!=0 && len>=check){
                    if (len>check){
                        count=1;
                    }else {
                        count++;
                    }

                    check=len-1;
                }
            }

        }
        System.out.println(count);
    }
}
