package Revision;

import java.util.Scanner;

public class Encrypt_It {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int n=scanner.nextInt();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)<=90 && 65<=str.charAt(i)){
                int ans=str.charAt(i)+n%26;
               ans=ans%91;

                if (ans<65) {
                    ans += 65;
                }
                char res=(char)ans;
                System.out.print(res);

            }else if (str.charAt(i)<=122 && 97<=str.charAt(i)){
                int ans=str.charAt(i)+n%26;
                ans=ans%123;
                if (ans<97) {
                    ans += 97;
                }
                    char res=(char)ans;
                    System.out.print(res);

            }else if (str.charAt(i)<=57 && 48<=str.charAt(i)){
                int a=str.charAt(i)+n%10;
                a=a%57;
                if (a>57){
                  a+=57;

                }
                char res=(char)a;
                System.out.print(res);
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
