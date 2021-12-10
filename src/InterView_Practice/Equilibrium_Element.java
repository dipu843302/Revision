package InterView_Practice;

import java.util.Scanner;

public class Equilibrium_Element {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new  int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        int leftsum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        int ans=1;
        boolean bln=false;
        for (int i=0;i<n;i++){
            sum-=arr[i];
            if (sum==leftsum){
                ans=i;
                bln=true;
                break;
            }
            leftsum+=arr[i];
        }
        if (bln){
            System.out.println(ans);
        }else {
            System.out.println(-1);
        }
    }
}
