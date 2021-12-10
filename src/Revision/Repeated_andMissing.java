package Revision;


import java.util.Scanner;

public class Repeated_andMissing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }

            int mis=0;

            for (int i=n-1;i>=0;i--){
                if (arr[i]!=i+1){
                    mis=i+1;
                    break;
                }
            }
               int rep=0;
            for (int i=0;i<n-1;i++){
                if (arr[i]==arr[i+1]){
                    rep=arr[i+1];
                    break;
                }
            }


            System.out.println(mis+" "+rep);
        }
    }
}
