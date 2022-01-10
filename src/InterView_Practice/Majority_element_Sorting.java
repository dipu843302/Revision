package InterView_Practice;

import java.util.Scanner;

public class Majority_element_Sorting {
    public static void main(test[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
           int index=0,count=1;
            for (int i=0;i<n;i++){
                if (arr[index]==arr[i]){
                    count++;
                }else {
                    count--;
                }
                if (count==0){
                    index=i;
                    count=1;
                }
            }
            count=0;
            for (int i=0;i<n;i++){
                if (arr[i]==arr[index]){
                    count++;
                }
            }
            if (count>n/2){
                System.out.println(arr[index]);
            }else {
                System.out.println(-1);
            }
        }
    }
}
