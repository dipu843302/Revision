package Revision;

import java.util.Scanner;

public class Noddys_Examination {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int q=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int ans=0;
        int skip=0;
        for (int i=0;i<n;i++){
            if (arr[i]<=q && skip<2){
                ans++;

            }else {
                skip++;
            }
            if (skip==2)
                break;;
        }
        System.out.println(ans);
    }
}
