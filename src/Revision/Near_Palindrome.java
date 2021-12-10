package Revision;

import java.util.Scanner;

public class Near_Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            String str=scanner.next();
            int left=0;
            int right=str.length()-1;
            int ans=0;
            while (left<right){
                if (str.charAt(left)!=str.charAt(right)){
                    ans++;
                }
                left++;
                right--;
            }
            if (k==ans){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
}
