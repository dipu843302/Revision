package Revision;

import java.util.Scanner;

public class Cipher_String {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            String s=scanner.next();
            int count=1;
            for (int i=0;i<n-1;i++){
                if (s.charAt(i)==s.charAt(i+1)){
                    count++;
                }else {
                    System.out.print(s.charAt(i));
                    System.out.print(count);
                    count=1;
                }
            }
            System.out.print(s.charAt(n-1));
            System.out.print(count);
            System.out.println();
        }
    }
}
