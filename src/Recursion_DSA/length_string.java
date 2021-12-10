package Recursion_DSA;

import java.util.Scanner;

public class length_string {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println(len(s));
    }

    private static int len(String s) {
        if (s.equals(""))return 0;
        else {
            return len(s.substring(1))+1;
        }
    }
}
