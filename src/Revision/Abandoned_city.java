package Revision;

import java.util.Scanner;

public class Abandoned_city {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {

            int n = scanner.nextInt();
            int k=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int count=0;
            int ans=0;
            int com=1234649643;
            boolean bln=false;
            for (int i=0;i<n;i++){
                count=0;
                for (int j=i;j<n;j++){
                    count+=arr[j];
                    if (count>=k){
                        if (com>j-i){
                            com=j-i;
                            ans=j-i+1;
                            bln=true;
                        }

                    }
                }

            }
            if (bln){
                System.out.println(ans);
          }else {
                System.out.println(-1);
            }
        }
    }
}
