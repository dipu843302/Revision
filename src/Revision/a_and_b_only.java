package Revision;

import java.util.Scanner;

public class a_and_b_only {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char q='?';
        for (int i=0;i<s.length()-1;i++){
            char x=s.charAt(i);
            char y=s.charAt(i+1);
            if (x==q && y=='b'){
                System.out.print("a");
            }else if (x==q && y=='a'){
                System.out.print("b");
            }else if (x=='a' || x=='b'){
                System.out.print(x);
            }else if (x==q && y==q){
                if (s.charAt(i-1)=='a'){
                    System.out.print('b');
                }else {
                    System.out.print('a');
                }
            }
        }
        System.out.print(s.charAt(s.length()-1));
    }
}
